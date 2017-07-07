package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import control.ControlPannello;
import control.ControlSportello;
import model.Sportello;
import control.ControlTotem;
import gui.FramePannello;
import gui.FrameSportello;
import gui.FrameTotem;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import javax.net.ssl.SSLSocket;

import model.Gestore;
import model.Tipo;

/**
 *
 * @author pierg
 */
public class Test_Gui {

    public static void main(String[] args) throws MalformedURLException, IOException {

        //FrameSportello frameSportello = new FrameSportello(new ControlSportello(new Sportello(1)));
        //        FrameTotem frameTotem = new FrameTotem(new ControlTotem());
        //    FramePannello fp = new FramePannello(new ControlPannello());
       
      
        Gestore g = new Gestore(1);
//        Sportello s1 = new Sportello(1);
//        FrameSportello frameSportello = new FrameSportello(new ControlSportello(s1));
        
        

    }

}
