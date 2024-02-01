package ro.ubb.soa.afoidas.services.interfaces;

import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.SneakerStore;

import java.util.List;

@Service
public interface SneakerStoreServiceInterface {
    public List<SneakerStore> getAllSneakerStores();

    public SneakerStore getSneakerStoreById(String id);

}
