package ro.ubb.soa.afoidas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.soa.afoidas.model.SneakerStore;
import ro.ubb.soa.afoidas.model.response.SneakerResponse;
import ro.ubb.soa.afoidas.model.response.SneakerStoreResponse;
import ro.ubb.soa.afoidas.services.SneakerStoreService;
import ro.ubb.soa.afoidas.services.interfaces.SneakerStoreServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SneakerStoreController {
    private final SneakerStoreServiceInterface sneakerStoreService;

    @Autowired
    public SneakerStoreController(SneakerStoreService sneakerStoreService) {
        this.sneakerStoreService = sneakerStoreService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<SneakerStore> getAllSneakerStores() {
        return sneakerStoreService.getAllSneakerStores();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public SneakerStore getSneakerStoreById(@PathVariable("id") String id) {
        return sneakerStoreService.getSneakerStoreById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/inventory")
    public SneakerStoreResponse getSneakerStoreInventory(@PathVariable("id") String sneakerStoreId) {
        SneakerStore sneakerStore = sneakerStoreService.getSneakerStoreById(sneakerStoreId);

        SneakerStoreResponse sneakerStoreResponse = new SneakerStoreResponse();
        sneakerStoreResponse.setSneakerStoreName(sneakerStore.getSneakerStoreName());
        sneakerStoreResponse.setInventory(sneakerStore.getInventory().stream().map(item -> {
            SneakerResponse sneakerResponse = new SneakerResponse();
            sneakerResponse.setSneakerId(item.getSneakerId());
            sneakerResponse.setSneakerName(item.getSneakerName());
            sneakerResponse.setSneakerBrand(item.getSneakerBrand());
            sneakerResponse.setSneakerPrice(item.getSneakerPrice());
            sneakerResponse.setSneakerSize(item.getSneakerSize());
            sneakerResponse.setIsInStock(item.getIsInStock());
            sneakerResponse.setPairsAvailable(item.getPairsAvailable());
            sneakerResponse.setIsSelected(false);

            return sneakerResponse;
        }).collect(Collectors.toList()));

        return sneakerStoreResponse;
    }
}
