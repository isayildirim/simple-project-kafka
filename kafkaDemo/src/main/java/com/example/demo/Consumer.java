package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener( topics = "${kafka.topic}", groupId = "${kafka.groupId}" )
    public void listenMessage(String message) {

        System.out.println(message);
    }

}
