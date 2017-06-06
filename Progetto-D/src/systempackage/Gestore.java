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
public class Gestore {
 
    Coda coda;
    
    //costruttore di Gestroe: ha come parametro la coda delle prenotazioni
    public Gestore(Coda coda){
     this.coda = coda;   
    }
    
    //metodo che fornisce la prossima prenotazione
    public synchronized Prenotazione prossimaPrenotazione(){
        return coda.next();
    }
    
}
