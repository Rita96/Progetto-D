/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * @author Piergiorgio Fedele
 * @author Davide Del Buono
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
        

    }

    //metodi get e set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
