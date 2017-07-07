/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author riccardo
 */
public class Sportello {

    private int ID;
    private Tipo tipologia;
    private boolean attivo;
    private boolean libero;
    private Prenotazione prenotazione;

    //costruttore di Sportello: viene passato come parametro solo il numero identificativo dello sportello
    public Sportello(int ID, Tipo t) {
        this.ID = ID;
        this.tipologia = t;
        this.attivo = true;
        this.libero = true;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public boolean isLibero() {
        return libero;
    }

    public void setLibero(boolean libero) {
        this.libero = libero;
    }

    public Tipo getTipologia() {
        return tipologia;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    //metodo che assegna una prenotazione a uno Sportello
    public synchronized void setPrenotazione(Prenotazione pren) {
        this.prenotazione = pren;
    }

    @Override
    public String toString() {
        return "Sportello{" + "ID=" + ID + '}';
    }

    //setter della tipologia
    void setTipologia(Tipo tipo) {
        this.tipologia = tipo;
    }

}
