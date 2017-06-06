/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import systempackage.ControlPannello;
import systempackage.Prenotazione;
import systempackage.Sportello;
import systempackage.Tipo;

/**
 *
 * @author Tonio
 */
public class TestPannello {
    
    public static void main (String args[]){
        
        ControlPannello cp = new ControlPannello();
        
        Prenotazione p1 = new Prenotazione(Tipo.A, 1);
        Prenotazione p2 = new Prenotazione(Tipo.C, 22);
        Prenotazione p3 = new Prenotazione(Tipo.D, 123);
        Prenotazione p4 = new Prenotazione(Tipo.B, 133);
        
        Sportello s1 = new Sportello(1);
        Sportello s2 = new Sportello(2);
        Sportello s3 = new Sportello(3);
        
        cp.aggiungiPrenotazione(p1, s1);
        cp.aggiungiPrenotazione(p4, s3);
        cp.aggiungiPrenotazione(p2, s2);
        
        cp.rimuoviPrenotazione(p4);
        
        cp.stampaRighePannello();
        
    }
}
