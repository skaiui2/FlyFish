package com.example.flyfish.config;

import com.example.flyfish.websocket.FlowWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new FlowWebSocketHandler(), "/ws/flow")
                .setAllowedOrigins("*"); // ????????
    }
}
