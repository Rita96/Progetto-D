/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

/**
 *
 * @author riccardo
 */
public class Prenotazione {
    
    Tipo tipologia;
    int numero;
    
    //costruttore di Prenotazione: ha come parametri il tipo e il numero della prenotazione
    public Prenotazione(Tipo tipologia, int numero)
    {
        this.tipologia = tipologia;
        this.numero = numero;
    }
    
//    //restituisce il codice della prenotazione
//    public String getCodice(){
//        return tipologia.toString() + numero;
//    }

    //restituisce il codice della prenotazione
    @Override
    public String toString() {
        return tipologia + Integer.toString(numero);
    }
}
