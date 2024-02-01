package ro.ubb.soa.afoidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;

import java.util.List;

public interface OrderRepository extends JpaRepository<SneakerStoreOrder, String> {

    @Query("SELECT o FROM SneakerStoreOrder o")
    List<SneakerStoreOrder> getAllOrders();
}
