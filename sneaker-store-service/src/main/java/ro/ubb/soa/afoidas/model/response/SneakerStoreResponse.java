package ro.ubb.soa.afoidas.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SneakerStoreResponse {
    private String sneakerStoreName;
    private List<SneakerResponse> inventory;
}
