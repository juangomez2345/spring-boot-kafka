package com.example.springbootkafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootkafka.kafka.producer.SpringKafkaProducer;

@RestController
@RequestMapping("/kafka")
public class SpringBootKafkaController {
	
	@Autowired
	private SpringKafkaProducer springKafkaProducer;
	
	@RequestMapping("/producer")
	public String printMessage() {
		String msgToSend = String.valueOf(System.currentTimeMillis());
		springKafkaProducer.publish(msgToSend);
		return msgToSend;
	}
	
	
	
}
