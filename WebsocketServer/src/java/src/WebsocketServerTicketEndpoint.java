package src;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import model.Gestore;


/**
 *
 * @author pierg
 */
@ServerEndpoint("/ticket")
public class WebsocketServerTicketEndpoint {

    String pannelloID;

    public WebsocketServerTicketEndpoint() {

    }

    @OnOpen
    public void onOpen(Session session) {

//        HandlerSessions.handler.getSessions().add(session);
    }

    @OnMessage
    public void onMessage(String s, Session session) throws IOException {

        if (s.equals("OK")) {

            pannelloID = session.getId();
            HandlerSessions.handler.setPannelloSession(session);
            System.out.println(s + "dal client");
        } else {

            String[] valori = s.split("-");
            int id = Integer.parseInt(valori[0]);
            int tipo = Integer.parseInt(valori[1]);
            System.out.println(id + "---" + tipo);
            String ticket = Gestore.getIstance().getCoda().next(id, tipo);

            session.getAsyncRemote().sendText(ticket);
            HandlerSessions.handler.getPannelloSession().getAsyncRemote().sendText(ticket);

        }
    }

    @OnClose
    public void onClose(Session session) {

    }

}
