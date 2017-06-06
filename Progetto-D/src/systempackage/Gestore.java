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
 
    public synchronized static Prenotazione prossimaPrenotazione(){
        return Coda.next();
    }
    
}
