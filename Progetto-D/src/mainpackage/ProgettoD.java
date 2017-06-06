/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import systempackage.Coda;
import systempackage.ControlSportello;
import systempackage.ControlTotem;
import systempackage.Tipo;

/**
 *
 * @author Tonio
 */
public class ProgettoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControlSportello cs = new ControlSportello();
        ControlTotem ct = new ControlTotem();
        Coda coda = new Coda();
        
        cs.creaSportello();
        cs.creaSportello();
        cs.creaSportello();
        
        ct.creaPrenotazione(Tipo.A);
        ct.creaPrenotazione(Tipo.B);
        ct.creaPrenotazione(Tipo.C);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.A);
        
        System.out.println(cs.toString());
        System.out.println(coda.toString());
        
    }
    
}
