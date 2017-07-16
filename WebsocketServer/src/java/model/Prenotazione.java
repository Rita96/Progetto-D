/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Riccardo Merlano
 */
/**
 * Una prenotazione è rappresentata da un numero e da una tipologia. Ad esempio
 * il trentesimo cliente che richiederà una prenotazione per servizi di tipo A
 * riceverà la prenotazione A30
 */
public class Prenotazione {

    private Tipo tipologia;
    private int numero;

    /**
     *
     * @param tipologia tipo della prenotazione (A, B, C, etc.)
     * @param numero numero della prenotazione
     */
    public Prenotazione(Tipo tipologia, int numero) {
        this.tipologia = tipologia;
        this.numero = numero;
    }

    //metodi get e set
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

    /**
     * restituisce il codice della prenotazione
     */
    @Override
    public String toString() {
        return tipologia + Integer.toString(numero);
    }
}
