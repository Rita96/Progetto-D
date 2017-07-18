/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import control.ControlLogin;
import control.ControlSportello;
import gui.FrameSportello;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.websocket.DeploymentException;

/**
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */
public class Test_Sportello {

    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {

        URI uriTicket = new URI("ws://10.87.244.124:8080/WebsocketServer/ticket");
        URI uriLogin = new URI("ws://10.87.244.124:8080/WebsocketServer/login");

        ControlSportello cSportello1 = new ControlSportello(1, 0, uriTicket);
        ControlSportello cSportello2 = new ControlSportello(1, 0, uriTicket);
        ControlSportello cSportello3 = new ControlSportello(1, 0, uriTicket);

        ControlLogin cLogin1 = new ControlLogin(uriLogin);
        ControlLogin cLogin2 = new ControlLogin(uriLogin);
        ControlLogin cLogin3 = new ControlLogin(uriLogin);

        FrameSportello fSportello1 = new FrameSportello(cSportello1, cLogin1);
        FrameSportello fSportello2 = new FrameSportello(cSportello2, cLogin2);
        FrameSportello fSportello3 = new FrameSportello(cSportello3, cLogin3);

    }

}
