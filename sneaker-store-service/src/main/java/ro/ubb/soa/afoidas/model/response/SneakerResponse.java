package ro.ubb.soa.afoidas.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SneakerResponse {
    private String sneakerId;
    private String sneakerBrand;
    private String sneakerName;
    private Float sneakerPrice;
    private Float sneakerSize;
    private Integer pairsAvailable;
    private Boolean isInStock;
    private Boolean isSelected;
}
