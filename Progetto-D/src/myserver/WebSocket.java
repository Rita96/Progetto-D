/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myserver;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author pierg
 */

@ServerEndpoint(value = "/test")  

public class WebSocket {
    
   
    @OnOpen
    public void onOpen(Session session) {
        // Metodo eseguito all'apertura della connessione
    }
 
    @OnMessage
    public String onMessage(String message, Session session) {
        // Metodo eseguito alla ricezione di un messaggio
        // La stringa 'message' rappresenta il messaggio
 
        // Il valore di ritorno di questo metodo sara' automaticamente
        // inviato come risposta al client. Ad esempio:
        return "Server received [" + message + "]";
    }
 
    @OnClose
    public void onClose(Session session) {
       // Metodo eseguito alla chiusura della connessione
    }
 
    @OnError
    public void onError(Throwable exception, Session session) {
        // Metodo eseguito in caso di errore
    } 
    
}
