package com.example.kafkamessagingsample.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${kafka.users.topic}")
    public void consumeMessage(final String message) {
        logger.info("Message received with content {}", message);
    }

    @KafkaListener(topics = "jessica-jones-1", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessageTopic1(final String message) {
        logger.info("Message received with content {}", message);
    }
}
