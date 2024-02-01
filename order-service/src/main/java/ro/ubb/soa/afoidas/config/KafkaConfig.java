package ro.ubb.soa.afoidas.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;
import org.springframework.kafka.support.serializer.JsonSerializer;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;

import java.util.HashMap;
import java.util.Map;

//@Configuration
//@EnableKafka
//public class KafkaConfig {
//    @Bean
//    public Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
//        return props;
//    }
//
//    @Bean
//    public ProducerFactory<String, SneakerStoreOrder> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }
//
//    @Bean
//    public KafkaTemplate<String, SneakerStoreOrder> kafkaTemplate() {
//        KafkaTemplate<String, SneakerStoreOrder> kafkaTemplate = new KafkaTemplate<>(producerFactory());
//        kafkaTemplate.setMessageConverter(new StringJsonMessageConverter());
//        kafkaTemplate.setDefaultTopic("order-topic");
//        return kafkaTemplate;
//    }
//}