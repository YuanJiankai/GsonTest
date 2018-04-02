//package WebSocket;
//
//import interceptor.HandshakeInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@Configuration
//@EnableWebSocket
//public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {
//
//    @Autowired
//    private WebSocketTest2 webSocketTest2;
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
//        webSocketHandlerRegistry.addHandler(webSocketTest2, "/websocket2").withSockJS();
//    }
//
//}
