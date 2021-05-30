package com.example.kafkamessagingsample.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("jessica-jones-1").build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("jessica-jones-2").build();
    }
}
