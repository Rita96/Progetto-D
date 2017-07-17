package src;

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
 * gestisce la connessione con websocket-client-totem per ricevere la tipologia
 * che {@link Gestore} deve elaborare e aggiungere in coda
 */
@ServerEndpoint("/totem")
public class WebsocketServerTotemEndpoint {

    public WebsocketServerTotemEndpoint() {

    }

    @OnOpen
    public void onOpen(Session session) {

    }

    @OnMessage
    public void onMessage(String s, Session session) {

        int tipo = Integer.parseInt(s);
        session.getAsyncRemote().sendText("BIGLIETTO---" + Gestore.getIstance().cambiaTipo(tipo) + "-" + Gestore.getIstance().addInCoda(tipo));

    }

    @OnClose
    public void onClose(Session session) {

    }

}
