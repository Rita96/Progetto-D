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
    
    public ThreadSportello(Gestore gestore){
        sp = ControlSportello.creaSportello();
        this.gestore = gestore;
    }
 
    @Override
    public void run(){
        sp = new Sportello(ControlSportello.nSportello);
        
        while(true){
            if(sp.libero)
                sincro(sp);
        }
    }
    
    synchronized void sincro(Sportello sp){
        sp.setPrenotazione(gestore.prossimaPrenotazione());
        sp.sonoOccupato();
    }
    
    public synchronized void libera(){
//        System.out.println(sp);
        this.sp.sonoDisponibile();
    }
    
}