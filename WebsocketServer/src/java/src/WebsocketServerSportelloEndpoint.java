package src;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import model.Gestore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierg
 */
@ServerEndpoint("/sportello")
public class WebsocketServerSportelloEndpoint {

    public WebsocketServerSportelloEndpoint() {

    }

    @OnOpen
    public void onOpen(Session session) {

    }

    @OnMessage
    public void onMessage(String s, Session session) throws IOException {

        String[] valori = s.split("-");
        int id = Integer.parseInt(valori[0]);
        int tipo = Integer.parseInt(valori[1]);
        System.out.println(id + "---" + tipo);
        String ticket = Gestore.getIstance().getCoda().next(id, tipo);
        
        session.getAsyncRemote().sendText(ticket);

    }

    @OnClose
    public void onClose(Session session) {

    }

}
