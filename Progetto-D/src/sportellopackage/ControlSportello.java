/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportellopackage;

import sportellopackage.FrameSportello;
import systempackage.Gestore;
import systempackage.Sportello;

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
        sportello.setLibero(false);
    }

    public void inviaStato() {

        //client.send gestito da websocket
        sportello.setLibero(true);
    }
    
    public void setAttivo(boolean bool){
        sportello.setAttivo(bool);
    }
    
    public boolean inviaCredenziali(String user, String password){
    
        return Gestore.checkLogin(user, password);
    
    }

}
