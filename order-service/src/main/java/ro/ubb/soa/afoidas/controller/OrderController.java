package ro.ubb.soa.afoidas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.soa.afoidas.model.OrderItem;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;
// import ro.ubb.soa.afoidas.services.EmailProducer;
import ro.ubb.soa.afoidas.services.OrderService;
import ro.ubb.soa.afoidas.services.interfaces.OrderServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {

    private final OrderServiceInterface orderService;
    //private final EmailProducer emailProducer;

    @Autowired
    public OrderController(OrderService orderService) {//, EmailProducer emailProducer) {
        this.orderService = orderService;
        //this.emailProducer = emailProducer;
    }

    @RequestMapping(method = RequestMethod.GET)
    private List<SneakerStoreOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.POST)
    private void placeOrder(@RequestBody SneakerStoreOrder order) {
        order.setItems(order.getItems().stream().map(item -> {
            OrderItem orderItem = new OrderItem();
            orderItem.setName(item.getName());
            orderItem.setPrice(item.getPrice());

            return orderItem;
        }).collect(Collectors.toList()));

        orderService.saveOrder(order);

        //emailProducer.sendEmail(order);
    }
}
