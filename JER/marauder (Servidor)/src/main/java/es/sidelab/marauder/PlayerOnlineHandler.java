package es.sidelab.marauder;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class PlayerOnlineHandler extends TextWebSocketHandler {
private Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
	
	
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("New session: " + session.getId());
		sessions.put(session.getId(), session);
	}
	
	
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Session closed: " + session.getId());
		sessions.remove(session.getId());
	}
	
	
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		sendOtherParticipants(session, message.getPayload());
	}

	private void sendOtherParticipants(WebSocketSession session, String payload) throws IOException {
		for(WebSocketSession participant : sessions.values()) {
			if(!participant.getId().equals(session.getId())) {
				participant.sendMessage(new TextMessage(payload));
			}
		}
	}
}
