/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.URI;
import javax.websocket.DeploymentException;
import src.WebsocketSportello;

/**
 *
 * @author davidedelbuono
 */
/**
 * Fa da tramite tra Gestore (server) e {@link gui.FrameSportello} (client) per lo scambio
 * di informazioni
 */
public class ControlSportello {

    private int idSportello;
    private int tipologia;
    private WebsocketSportello websocketTicket;

    public ControlSportello(int idSportello, int tipologia, URI endpointURI) throws DeploymentException, IOException {
        this.websocketTicket = new WebsocketSportello(endpointURI);
        this.idSportello = idSportello;
        this.tipologia = tipologia;

    }

    public int getIdSportello() {
        return idSportello;
    }

    public int getTipologia() {
        return tipologia;
    }

    
    
    public void dammiPrenotazione(int idSportello, int tipo, WebsocketSportello.MessageHandler messageHandler) {

        websocketTicket.sendMessage(idSportello + "-" + tipo);
        websocketTicket.addMessageHandler(messageHandler);

    }

}
