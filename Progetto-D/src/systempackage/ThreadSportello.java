/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

/**
 *
 * @author Utente
 */
public class ThreadSportello extends Thread{
    
    Sportello sp;
    Gestore gestore;
    
    //costruttore del ThreadSportello: ha come parametri il gestore a cui fa riferimento e il umero dello sportello
    public ThreadSportello(Gestore gestore, int numero){
        sp = new Sportello(numero);
        this.gestore = gestore;
    }
 
    //metodo run del Thread
    @Override
    public void run(){
        
        while(true){
            if(sp.libero)
                ottieniPrenotazione(sp);
        }
    }
    
    //metodo che ottiene la prenotazione e imposta lo sportello occupato
    synchronized void ottieniPrenotazione(Sportello sp){
        sp.setPrenotazione(gestore.prossimaPrenotazione());
        sp.sonoOccupato();
    }
    
    //metodo che rende lo sportello ancora disponibile
    public synchronized void libera(){
//        System.out.println(sp);
        this.sp.sonoDisponibile();
    }
    
}