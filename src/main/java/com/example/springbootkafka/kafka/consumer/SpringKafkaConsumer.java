package com.example.springbootkafka.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SpringKafkaConsumer {
	
    @KafkaListener(topics = "kafka_string_msgs", containerFactory = "kafkaListenerContainerFactory")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("::ConsumerRecord Info: " + record);
    }
}
