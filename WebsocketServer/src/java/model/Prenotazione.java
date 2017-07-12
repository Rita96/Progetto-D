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
public class Prenotazione {

    private Tipo tipologia;
    private int numero;

    //costruttore di Prenotazione: ha come parametri il tipo e il numero della prenotazione
    public Prenotazione(Tipo tipologia, int numero) {
        this.tipologia = tipologia;
        this.numero = numero;
    }

    public Tipo getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipo tipologia) {
        this.tipologia = tipologia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //restituisce il codice della prenotazione
    @Override
    public String toString() {
        return tipologia + Integer.toString(numero);
    }
}
