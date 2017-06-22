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
    
    ArrayList<Prenotazione> listaprenotazioni;
    int numeroprenotazioni;
    
    //costruttore di coda, inizializza un ArrayList vuoto e il numero di prenotazioni pari a zero
    public Coda(){
        this.listaprenotazioni = new ArrayList(0);
        this.numeroprenotazioni = 0;
    }

    //metodo che aggiunge una preotazione passata come paramtro e la aggiunge alla coda (ArrayList)
    public void aggiungiPrenotazione(Prenotazione ticket) {
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
    
    //fornisce la prossima prenotazione nella lista
    public synchronized Prenotazione next(){
        while(listaprenotazioni.size() == 0){}
        Prenotazione buffer = listaprenotazioni.get(0);
        listaprenotazioni.remove(0);
        numeroprenotazioni--;
        return buffer;
    }
}
