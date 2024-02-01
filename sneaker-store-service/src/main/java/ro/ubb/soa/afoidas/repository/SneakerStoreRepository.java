package ro.ubb.soa.afoidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ubb.soa.afoidas.model.SneakerStore;

import java.util.List;
import java.util.Optional;

public interface SneakerStoreRepository extends JpaRepository<SneakerStore, String> {
    @Query("SELECT s FROM SneakerStore s")
    List<SneakerStore> getAllSneakerStores();

    @Query("SELECT store from SneakerStore store WHERE store.sneakerStoreId = ?1")
    Optional<SneakerStore> getSneakerStoreById(String id);
}
