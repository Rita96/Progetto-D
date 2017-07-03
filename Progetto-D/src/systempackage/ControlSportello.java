/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import guipackage.FrameSportello;

/**
 *
 * @author riccardo
 */
//classe per ora inutilizzata
public class ControlSportello {

    private Sportello sportello;
    private FrameSportello fSportello;

    public ControlSportello(Sportello sportello) {
        this.sportello = sportello;
        this.fSportello = new FrameSportello(this);
    }

    public Sportello getSportello() {
        return sportello;
    }

    public void setSportello(Sportello sportello) {
        this.sportello = sportello;
    }

    public void ricevePrenotazione() {

        //server.receive gestito da websocket
        sportello.setAttivo(false);
    }

    public void inviaStato() {

        //client.send gestito da websocket
        sportello.setAttivo(true);
    }
    
    public boolean inviaCredenziali(String user, String password){
    
        return Gestore.checkLogin(user, password);
    
    }

}
