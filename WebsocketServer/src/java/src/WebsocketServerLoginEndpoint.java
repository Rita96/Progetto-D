package src;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import model.Gestore;
import model.Tipo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierg
 */
@ServerEndpoint("/login")
public class WebsocketServerLoginEndpoint {

    public WebsocketServerLoginEndpoint() {

    }

    @OnOpen
    public void onOpen(Session session) {

    }

    @OnMessage
    public void onMessage(String s, Session session) throws IOException {

        if (s.equals("EXIT")) {

            session.close();

        } else {

            String[] credenziali;
            credenziali = s.split("-");
            if (Gestore.getIstance().checkLogin(credenziali[0], credenziali[1])) {

                session.getAsyncRemote().sendText("true");

            } else {
                session.getAsyncRemote().sendText("false");
            }

        }

    }

    @OnClose
    public void onClose(Session session) {

        System.out.println("Chiusa");
        
    }

}
