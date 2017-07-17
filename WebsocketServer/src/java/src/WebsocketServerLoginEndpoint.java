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
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */
/**
 * quando viene fatta richiesta di login da un websocket-client questo
 * websocket-server-endpoint gestisce la richiesta, se le credenziali sono
 * corrette instaura la connessione client-server
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
