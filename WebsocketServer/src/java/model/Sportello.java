/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RiccardoMerlano
 */
/**
 *
 * la classe rappresenta lo sportello attraverso il quale l'operatore potrà
 * erogare i servizi al cliente
 */
public class Sportello {

    /**
     * identificativo dello sportello
     */
    private int ID;
    /**
     * tipologia di servizi erogati <p> {@link Tipo}
     */
    private Tipo tipologia;
    /**
     * indica se lo sportello è attivo
     */
    private boolean attivo;
    /**
     * indica se lo sportello è libero, in grado di ricevere una nuova
     * {@link Prenotazione}
     */
    private boolean libero;
    /**
     * la {@link Prenotazione} servita attualmente
     * 
     */
    private Prenotazione prenotazione;

    /**
     *
     * @param ID il numero identificativo dello sportello
     * @param t la tipologia di operazioni preferenziale dello sportello
     */
    public Sportello(int ID, Tipo t) {
        this.ID = ID;
        this.tipologia = t;
        this.attivo = true;
        this.libero = true;

    }

    //metodi get e set
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

    void setTipologia(Tipo tipo) {
        this.tipologia = tipo;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    /**
     * metodo che assegna una prenotazione a uno Sportello
     * 
     *
     * @see Prenotazione
     * @param pren la prenotazione che viene assegnata allo sportello
     *
     */
    public synchronized void setPrenotazione(Prenotazione pren) {
        this.prenotazione = pren;
    }

    @Override
    public String toString() {
        return "Sportello{" + "ID=" + ID + '}';
    }

}
