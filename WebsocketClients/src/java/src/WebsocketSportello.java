/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.net.URI;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

/**
 *
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */
/**
 *
 * 
 * è il client-endpoint che {@link control.ControlSportello} deve istanziare per
 * poter comunicare richieste delle prossime prenotazioni al
 * WebsocketServerSportelloEndpoint
 *
 */
@ClientEndpoint
public class WebsocketSportello {

    private MessageHandler messageHandler;
    private Session userSession;

    public WebsocketSportello(URI endpointURI) throws DeploymentException, IOException {

        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(this, endpointURI);

    }

    @OnOpen
    public void onOpen(Session session) {

        this.userSession = session;

    }

    @OnMessage
    public void onMessage(String s, Session session) {

        messageHandler.handleMessage(s);
    }

    @OnClose
    public void onClose(Session session) {

    }

    public void addMessageHandler(MessageHandler msgHandler) {
        this.messageHandler = msgHandler;
    }

    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);

    }

    public static interface MessageHandler {

        public void handleMessage(String message);
    }

    private class userSession {

        public userSession() {
        }
    }

    public Session getUserSession() {
        return userSession;
    }

    public void setUserSession(Session userSession) {
        this.userSession = userSession;
    }

}
