package com.example.kafkamessagingsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
public class ExternalConfig {
}
