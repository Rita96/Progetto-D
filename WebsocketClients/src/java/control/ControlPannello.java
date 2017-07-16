/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.URI;
import javax.websocket.DeploymentException;
import src.WebsocketPannello;

/**
 *
 * @author RiccardoMerlano Riceve le informazioni da Gestore per rappresentare
 * le prenotazioni (es. A22 --> SP2) su FramePannello  {@link FramePannello}
 * {@link Gestore}
 */
public class ControlPannello {

    Boolean check = false;

    private WebsocketPannello websocketPannello;

    public ControlPannello(URI uriEndpoint) throws DeploymentException, IOException {

        this.websocketPannello = new WebsocketPannello(uriEndpoint);
        this.check = true;

    }

    public void riceviTurno(WebsocketPannello.MessageHandler messageHandler) {

        if (check) {

            websocketPannello.sendMessage("OK");
            check = false;
        }
        websocketPannello.addMessageHandler(messageHandler);

    }

}
