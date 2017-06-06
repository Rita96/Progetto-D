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
    
    public Gestore(Coda coda){
     this.coda = coda;   
    }
    
    public synchronized Prenotazione prossimaPrenotazione(){
        return coda.next();
    }
    
}
