package com.example.flyfish.kafka;

import com.example.flyfish.websocket.FlowWebSocketHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FlowConsumer {

    @KafkaListener(topics = "wirefisher.flow", groupId = "flyfish-consumer")
    public void consume(String message) {
        System.out.println("[Kafka] get message: " + message);
        //push to front
        FlowWebSocketHandler.broadcast(message);
    }
}
