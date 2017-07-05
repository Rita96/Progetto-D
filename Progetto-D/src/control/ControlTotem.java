/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import gui.FrameTotem;
import model.Tipo;

/**
 *
 * @author riccardo
 */
public class ControlTotem {

    public ControlTotem() {

    }

    public void inviaTipologia(Tipo t) {

        System.out.println("Invio tipo " + t.toString());//client.send gestido da websocket
    }

}
