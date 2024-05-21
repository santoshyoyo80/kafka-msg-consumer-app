package com.insightscode.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * This component is used to Listen the topic on which the kafka message is available
 */
@Component
public class KafkaConsumerLister {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerLister.class);
    @KafkaListener(topics = "${spring.kafka.topic-name}")
    public void onKafkaMessage(@Payload String payload){
        System.out.println("The payload received from kafka->"+payload);
        LOGGER.info("Kafka consumer received payload {} "+payload);
    }
}
