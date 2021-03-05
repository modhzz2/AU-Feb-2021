package com.parth.LibraryEventBookConsumer;

import java.util.List;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.parth.LibraryEventBookConsumer.domain.OrderEvent;

@EnableKafka
@Service
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(id="kafka_group_one",topics="test-topic")
	public void processMessage(@Payload List<OrderEvent> libraryEvents,
			@Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
			@Header(KafkaHeaders.OFFSET) List<Long> offset) {
		System.out.println(libraryEvents.get(0));
	}

}