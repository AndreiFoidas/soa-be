package ro.ubb.soa.afoidas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ubb.soa.afoidas.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}
