package com.example.kafkamessagingsample.producers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NewMessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(NewMessageProducer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic;

    public NewMessageProducer(@Value("${kafka.jessica-jones-1.topic}") final String topic, final KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void sendMessage(final String message) {
        logger.info("Producing message {} to topic {}", message, topic);
        kafkaTemplate.send(topic, message);
    }
}
