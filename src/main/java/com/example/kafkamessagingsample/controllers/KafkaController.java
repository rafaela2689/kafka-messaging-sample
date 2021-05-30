package com.example.kafkamessagingsample.controllers;

import com.example.kafkamessagingsample.producers.MessageProducer;
import com.example.kafkamessagingsample.producers.NewMessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final MessageProducer producer;
    private final NewMessageProducer newProducer;

    public KafkaController(final MessageProducer producer,
            final NewMessageProducer newProducer) {
        this.producer = producer;
        this.newProducer = newProducer;
    }

    @PostMapping("/publish")
    public void publish(@RequestParam("message") final String message) {
        this.producer.sendMessage(message);
    }

    @PostMapping("/publish-new")
    public void publishNew(@RequestParam("message") final String message) {
        this.newProducer.sendMessage(message);
    }
}
