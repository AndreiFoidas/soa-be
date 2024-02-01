package ro.ubb.soa.afoidas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SneakerStoreServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SneakerStoreServiceApplication.class, args);
    }
}
