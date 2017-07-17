/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.HashSet;
import java.util.Set;
import javax.websocket.Session;

/**
 *
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */
/**
 *
 * è un Singleton che tiene traccia delle sessioni degli sportelli e del
 * pannello; memorizza la sessione del pannello, che verrà utilizzata dal
 * {@link WebsocketServerTicketEndpoint} per inviare le prenotazioni al pannello
 * senza bisogno di richiederle come nel caso degli sportelli
 *
 */
public class HandlerSessions {

    public static HandlerSessions handler = new HandlerSessions();
    private static Session pannelloSession;
    private Set<Session> sessions;

    private HandlerSessions() {

        sessions = new HashSet<>();

    }

    public HandlerSessions getHandler() {
        return handler;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public static Session getPannelloSession() {
        return pannelloSession;
    }

    public static void setPannelloSession(Session pannelloSession) {
        HandlerSessions.pannelloSession = pannelloSession;
    }

}
