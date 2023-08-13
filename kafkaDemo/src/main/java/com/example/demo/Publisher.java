package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Value( value = "${kafka.topic}" )
    private String topic;

    public void sendMessage(String message) {

        //we can check the callback
        kafkaTemplate.send(topic, message);

    }

}
