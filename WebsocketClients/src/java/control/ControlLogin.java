/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.URI;
import javax.websocket.DeploymentException;
import src.WebsocketLogin;

/**
 *
 * @author Piergiorgio Fedele
 */

/**
 *  invia le credenziali al server per verificare la corrispondenza 
 *  username-password
 */
public class ControlLogin {

    private WebsocketLogin login;

    public ControlLogin(URI endpoint) throws DeploymentException, IOException {

        login = new WebsocketLogin(endpoint);

    }

    public void inviaCredenziali(String user, String password, WebsocketLogin.MessageHandler callback) {

        login.sendMessage(user + "-" + password);
        login.addMessageHandler(callback);
    }
    
    public void logout(){
    
        login.sendMessage("EXIT");
    }

}
