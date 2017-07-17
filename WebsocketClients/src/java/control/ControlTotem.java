/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.URI;
import javax.websocket.DeploymentException;
import src.WebsocketTotem;

/**
 *
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */

/**
 * Invia le prenotazioni effettua tramite FrameTotem al Gestore
 */
public class ControlTotem {

    final WebsocketTotem totemClient;

    public ControlTotem(URI endpoint) throws DeploymentException, IOException {

        this.totemClient = new WebsocketTotem(endpoint);

    }

    public void inviaTipologia(int tipo) throws InterruptedException {

        totemClient.sendMessage(Integer.toString(tipo));

    }

}
