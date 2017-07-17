package utils;

import control.ControlLogin;
import control.ControlPannello;
import control.ControlSportello;
import control.ControlTotem;
import gui.FramePannello;
import gui.FrameSportello;
import gui.FrameTotem;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.websocket.DeploymentException;

/**
 *
 * @author Antonio Minolfi
 */
/**
 * classe di test
 *
 */
public class Test {

    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {

        //FrameTotem frameTotem = new FrameTotem(new ControlTotem(new URI("ws://10.87.244.124:8080/WebsocketServer/totem")));
        URI uriTicket = new URI("ws://10.87.244.124:8080/WebsocketServer/ticket");
        FrameSportello frameSportello = new FrameSportello(new ControlSportello(1, 2, uriTicket), new ControlLogin(new URI("ws://10.87.244.124:8080/WebsocketServer/login")));
    }
}
