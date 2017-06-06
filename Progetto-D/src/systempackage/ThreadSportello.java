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
 
    @Override
    public void run(){
        sp = new Sportello(ControlSportello.nSportello);
        
        while(true){
            if(sp.libero)
                sincro(sp);
        }
    }
    
    synchronized void sincro(Sportello sp){
        System.out.println(Gestore.prossimaPrenotazione());
        sp.sonoOccupato();
    }
    
    public synchronized void libera(){
        sp.sonoDisponibile();
    }
    
}
