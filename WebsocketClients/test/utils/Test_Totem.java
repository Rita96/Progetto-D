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
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
 */
/**
 * classe di test
 *
 */
public class Test_Totem {

    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {

        URI uriTotem = new URI("ws://10.87.244.124:8080/WebsocketServer/totem");
        ControlTotem cTotem = new ControlTotem(uriTotem);
        FrameTotem frameTotem = new FrameTotem(cTotem);

    }
}
