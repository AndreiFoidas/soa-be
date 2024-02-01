package ro.ubb.soa.afoidas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;
//
//@Service
//public class EmailProducer {
//
//    private final KafkaTemplate<String, SneakerStoreOrder> kafkaTemplate;
//
//    @Autowired
//    public EmailProducer(KafkaTemplate<String, SneakerStoreOrder> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendEmail(SneakerStoreOrder order) {
//        kafkaTemplate.send("order-topic", order);
//    }
//}