/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.ArrayList;

/**
 *
 * @author riccardo
 */
public class Coda {
    
    static ArrayList<Prenotazione> listaprenotazioni;
    static int numeroprenotazioni;
    
    public Coda(){
        Coda.listaprenotazioni = new ArrayList<Prenotazione>(0);
        Coda.numeroprenotazioni = 0;
    }

    static void aggiungiPrenotazione(Prenotazione ticket) {
        numeroprenotazioni++;
        listaprenotazioni.add(ticket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for(Prenotazione p : listaprenotazioni){
            sb.append(p+"\n");
        }
        
        return sb.toString();
    }
}
