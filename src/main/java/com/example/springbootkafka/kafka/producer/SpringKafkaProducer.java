package com.example.springbootkafka.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "kafka_string_msgs";

    public void publish(String message){
        kafkaTemplate.send(topic, message);
    }
}
