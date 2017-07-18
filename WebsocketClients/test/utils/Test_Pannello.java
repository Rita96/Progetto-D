/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import control.ControlPannello;
import gui.FramePannello;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.websocket.DeploymentException;

/**
 *
 * @author pierg
 */
public class Test_Pannello {
    
    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {
        
        URI uriPannello = new URI("ws://10.87.244.124:8080/WebsocketServer/ticket");
        ControlPannello cPannello = new ControlPannello(uriPannello);
        FramePannello fPannello = new FramePannello(cPannello);
        
        
    }
    
}
