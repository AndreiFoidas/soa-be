package ro.ubb.soa.afoidas.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Sneaker {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String sneakerId;
    private String sneakerBrand;
    private String sneakerName;
    private Float sneakerPrice;
    private Float sneakerSize;
    private Integer pairsAvailable;
    private Boolean isInStock;
}
