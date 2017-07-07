/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import callbacks.ITotemManager;
import gui.FrameTotem;
import model.Tipo;

/**
 *
 * @author riccardo
 */
public class ControlTotem {

    private ITotemManager manager;

    public ControlTotem() {

    }

    public void inviaTipologia(Tipo t) {
           







        System.out.println("Invio tipo " + t.toString());//client.send gestido da websocket
    }

    public void onMessage() {
        manager.onNewReservation(null);
    }

    public ITotemManager getManager() {
        return manager;
    }

    public void setManager(ITotemManager manager) {
        this.manager = manager;
    }

}
