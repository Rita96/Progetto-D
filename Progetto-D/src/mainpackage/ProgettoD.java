/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import systempackage.Coda;
import systempackage.ControlSportello;
import systempackage.ControlTotem;
import systempackage.Gestore;
import systempackage.Sportello;
import systempackage.ThreadSportello;
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
        
        Coda coda = new Coda();
        ControlSportello cs = new ControlSportello();
        Gestore g = new Gestore(coda);
        ThreadSportello ts = new ThreadSportello(g, 1);
        ThreadSportello ts2 = new  ThreadSportello(g, 2);
        ControlTotem ct = new ControlTotem(coda);
        
//        cs.creaSportello();
//        cs.creaSportello();
//        cs.creaSportello();
        
        ct.creaPrenotazione(Tipo.A);
        ct.creaPrenotazione(Tipo.B);
        ct.creaPrenotazione(Tipo.C);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.D);
        ct.creaPrenotazione(Tipo.A);
        
//        System.out.println(cs.toString());
//        System.out.println(coda.toString());
        
        System.out.println("----------------------------");
        
//        System.out.println(g.prossimaPrenotazione());
//        System.out.println(g.prossimaPrenotazione());
        ts.start();
        ts2.start();
        ts.libera();
        ts2.libera();
        ts2.libera();
        
        System.out.println("----------------------------");
        
//        System.out.println(coda.toString());
    }
    
}
