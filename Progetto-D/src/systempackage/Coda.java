/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 *
 * @author riccardo
 */
public class Coda {
    
    ArrayList<Prenotazione> listaprenotazioni;
    int numeroprenotazioni;
    
    //costruttore di coda, inizializza un ArrayList vuoto e il numero di prenotazioni pari a zero
    public Coda(){
        this.listaprenotazioni = new ArrayList();
        this.numeroprenotazioni = 0;
    }

    //metodo che aggiunge una preotazione passata come paramtro e la aggiunge alla coda (ArrayList)
    public synchronized void aggiungiPrenotazione(Prenotazione ticket) {
        numeroprenotazioni++;
        listaprenotazioni.add(ticket);
        System.out.println(ticket);
    }
    
    //fornisce la prossima prenotazione nella lista
    public synchronized void next(Sportello sp){
        if(numeroprenotazioni==0){
            ThreadRicerca t = (ThreadRicerca) Thread.currentThread();
            t.interrupt();
        }
        if(sp.libero && sp.tipologia.equals(Tipo.NULL)){
            try{
                Prenotazione ticket = listaprenotazioni.get(0);
                listaprenotazioni.remove(0);
                numeroprenotazioni--;
                sp.sonoOccupato();
                sp.setPrenotazione(ticket);
                System.out.println(ticket);
            }catch(IndexOutOfBoundsException e){
                
            }
        }
        else if(sp.libero){
            Iterator itr = listaprenotazioni.iterator();
            Prenotazione ticket;
            
            try{
                while(itr.hasNext()) {
                    ticket = (Prenotazione) itr.next();
                    if(sp.tipologia.equals(ticket.tipologia)){
                        int ind = listaprenotazioni.indexOf(ticket);
                        listaprenotazioni.remove(ind);
                        numeroprenotazioni--;
                        sp.sonoOccupato();
                        sp.setPrenotazione(ticket);
                        System.out.println(ticket);
                    }
                }
            }catch(ConcurrentModificationException e){
                        
            }
        }
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
