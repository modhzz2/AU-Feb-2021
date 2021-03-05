package com.parth.LibraryEventBookProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.parth.LibraryEventBookProducer.domain.OrderEvent;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class LibraryEventProducer {

	@Autowired
	private KafkaTemplate<String, OrderEvent> kafkaTemplate;

	public void sendLibraryEventAsynchronous(OrderEvent orderEvent) throws JsonProcessingException {
		kafkaTemplate.send("test-topic", orderEvent);
	}

}
