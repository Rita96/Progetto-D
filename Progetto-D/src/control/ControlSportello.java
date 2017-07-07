/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import callbacks.ISportelloManager;
import gui.FrameSportello;
import model.Gestore;
import model.Prenotazione;
import model.Sportello;
import model.Tipo;

/**
 *
 * @author riccardo
 */
//classe per ora inutilizzata
public class ControlSportello {

    private Sportello sportello;
    private ISportelloManager manager;

    public ControlSportello(Sportello sportello) {
        this.sportello = sportello;

    }

    public Sportello getSportello() {
        return sportello;
    }

    public void setSportello(Sportello sportello) {
        this.sportello = sportello;
    }

    public void ricevePrenotazione() {

        //server.receive gestito da websocket
        Prenotazione prenotazione = new Prenotazione(Tipo.A, 0);
        manager.onNextReservation(prenotazione);
        sportello.setLibero(false);
    }

    public void inviaStato() {

        //client.send gestito da websocket
        sportello.setLibero(true);
    }

    public void setAttivo(boolean bool) {
        sportello.setAttivo(bool);
    }

    public boolean inviaCredenziali(String user, String password) {

        return Gestore.checkLogin(user, password);

    }

    public ISportelloManager getManager() {
        return manager;
    }

    public void setManager(ISportelloManager manager) {
        this.manager = manager;
    }

    public int convertiTipo(Tipo tipo) {
        switch (tipo) {
            case A:
                return 0;
            case B:
                return 1;
            case C:
                return 2;

            default:
                return -1;
        }
    }

}
