/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totempackage;

import systempackage.Tipo;

/**
 *
 * @author riccardo
 */
public class ControlTotem {

    private FrameTotem fTotem;

    public ControlTotem() {

        fTotem = new FrameTotem(this);

    }

    public void inviaTipologia(Tipo t) {

        System.out.println("Invio tipo " + t.toString());//client.send gestido da websocket
    }

}
