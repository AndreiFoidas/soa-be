package ro.ubb.soa.afoidas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.OrderItem;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;
import ro.ubb.soa.afoidas.repository.OrderItemRepository;
import ro.ubb.soa.afoidas.repository.OrderRepository;
import ro.ubb.soa.afoidas.services.interfaces.OrderServiceInterface;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<SneakerStoreOrder> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public void saveOrder(SneakerStoreOrder sneakerStoreOrder) {
        orderItemRepository.save(sneakerStoreOrder.getItems());
        orderRepository.save(sneakerStoreOrder);
    }
}
