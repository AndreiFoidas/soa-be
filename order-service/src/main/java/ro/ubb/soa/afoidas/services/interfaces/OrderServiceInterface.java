package ro.ubb.soa.afoidas.services.interfaces;

import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;

import java.util.List;

@Service
public interface OrderServiceInterface {

    List<SneakerStoreOrder> getAllOrders();

    void saveOrder(SneakerStoreOrder sneakerStoreOrder);
}
