package com.example.kafkamessagingsample.controllers;

import com.example.kafkamessagingsample.producers.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final MessageProducer producer;

    public KafkaController(final MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void publish(@RequestParam("message") final String message) {
        this.producer.sendMessage(message);
    }
}
