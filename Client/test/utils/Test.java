package utils;


import control.ControlLogin;
import control.ControlSportello;
import control.ControlTotem;
import gui.FrameSportello;
import gui.FrameTotem;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.websocket.DeploymentException;

public class Test {

    public static void main(String[] args) throws URISyntaxException, DeploymentException, IOException {

        FrameTotem frameTotem = new FrameTotem(new ControlTotem(new URI("ws://localhost:8080/WebsocketServer/totem")));
        FrameSportello frameSportello = new FrameSportello(new ControlSportello(1, 0, new URI("ws://localhost:8080/WebsocketServer/sportello")),new ControlLogin(new URI("ws://localhost:8080/WebsocketServer/login")));
        
}
}