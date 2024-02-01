package ro.ubb.soa.afoidas.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class SneakerStoreOrder {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String orderId;
    private String name;
    private String deliveryAddress;
    private String phoneNumber;
    private Float price;
    private String emailAddress;
    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<OrderItem> items;
}
