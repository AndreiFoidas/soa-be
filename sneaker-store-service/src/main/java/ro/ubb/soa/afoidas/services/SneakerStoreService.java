package ro.ubb.soa.afoidas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.SneakerStore;
import ro.ubb.soa.afoidas.repository.SneakerStoreRepository;
import ro.ubb.soa.afoidas.services.interfaces.SneakerStoreServiceInterface;

import java.util.List;

@Service
public class SneakerStoreService implements SneakerStoreServiceInterface {
    private final SneakerStoreRepository sneakerStoreRepository;

    @Autowired
    public SneakerStoreService(SneakerStoreRepository sneakerStoreRepository) {
        this.sneakerStoreRepository = sneakerStoreRepository;
    }

    @Override
    public List<SneakerStore> getAllSneakerStores() {
        return sneakerStoreRepository.getAllSneakerStores();
    }

    @Override
    public SneakerStore getSneakerStoreById(String id) {
        return sneakerStoreRepository.getSneakerStoreById(id).get();
    }
}
