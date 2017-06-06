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
    
    static ArrayList listaprenotazioni;
    static int numeroprenotazioni;
    
    public Coda(){
        Coda.listaprenotazioni = new ArrayList();
        Coda.numeroprenotazioni = 0;
    }

    static void aggiungiPrenotazione(Prenotazione ticket) {
        numeroprenotazioni++;
        listaprenotazioni.add(ticket);
    }
    
}
