package WebSocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class WebSocketTest2 extends TextWebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketTest2.class);
    // 并发 但是我其实不需要弄一个并发的出来..
    private static final List<WebSocketSession> sessions = Collections.synchronizedList(new ArrayList<WebSocketSession>());

    // 连接建立
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("connect to client ---------------");
        sessions.add(session);
    }

    // 消息接收
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info(message.getPayload());
        try {
            TextMessage message1 = new TextMessage("this is the first message");
            session.sendMessage(message1);
            int n = 0;
            while(n < 3) {
                TextMessage messagen = new TextMessage("this is a message. Count is " + n);
                session.sendMessage(messagen);
                n++;
            }
            TextMessage message2 = new TextMessage("this is the end message");
            session.sendMessage(message2);
        } catch (IOException e) {
            logger.error("some questions have bean happened ---------------");
            e.printStackTrace();
        }
        logger.info("message send success");
    }

    // 异常处理
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if(session.isOpen()) {
            session.close();
        }
        logger.error("connect error have bean happened......");
        logger.info("session close -------------------");
        sessions.remove(session);
    }

    // 连接关闭
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("close connection ---------------");
        if(session.isOpen()) {
            session.close();
        }
        sessions.remove(session);
    }
}
