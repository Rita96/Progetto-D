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
public class ControlSportello {

    private int idSportello;
    private int tipologia;
    private WebsocketSportello websocketSportello;

    public ControlSportello(int idSportello, int tipologia, URI endpointURI) throws DeploymentException, IOException {
        this.websocketSportello = new WebsocketSportello(endpointURI);
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

        
        websocketSportello.sendMessage(idSportello + "-"+tipo);
        websocketSportello.addMessageHandler(messageHandler);

    }

}
