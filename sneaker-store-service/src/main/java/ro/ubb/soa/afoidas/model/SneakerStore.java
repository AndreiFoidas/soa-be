package ro.ubb.soa.afoidas.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class SneakerStore {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String sneakerStoreId;
    private String sneakerStoreName;
    private String sneakerStoreAddress;
    private String sneakerStoreDescription;
    private Float sneakerStoreRating;

    @OneToMany
    private List<Sneaker> inventory;
}
