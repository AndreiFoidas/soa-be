package ro.ubb.soa.afoidas.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ro.ubb.soa.afoidas.model.SneakerStoreOrder;

@Service
public class EmailKafkaConsumer {

    private final EmailService emailService;

    public EmailKafkaConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @KafkaListener(topics = "order-topic", groupId = "email-group")
    public void listen(SneakerStoreOrder order) {
        // Process the received order and send confirmation email
        String to = order.getEmailAddress();
        String subject = "Order Confirmation";
        String text = "Thank you for your order!\n\nOrder details:\n" + order.toString();

        emailService.sendOrderConfirmationEmail(to, subject, text);
    }
}