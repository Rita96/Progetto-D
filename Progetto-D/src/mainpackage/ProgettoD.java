/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import guipackage.FrameSportello;
import guipackage.FrameTotem;
import systempackage.Coda;
import systempackage.ControlPannello;
import systempackage.ControlSportello;
import systempackage.ControlTotem;
import systempackage.Gestore;
import systempackage.ServerSportello;

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
        ControlPannello cp = new ControlPannello();
        Gestore g = new Gestore(coda);
        ControlTotem ct = new ControlTotem(g);
        ControlSportello cs = new ControlSportello(g);
//        ThreadSportello ts = new ThreadSportello(g, 1);
//        ThreadSportello ts2 = new  ThreadSportello(g, 2);
        ServerSportello server = new ServerSportello(g, cs);
        server.start();
//        cs.creaSportello();
//        cs.creaSportello();
//        cs.creaSportello();
//        
//        ct.creaPrenotazione(Tipo.A);
//        ct.creaPrenotazione(Tipo.B);
//        ct.creaPrenotazione(Tipo.C);
//        ct.creaPrenotazione(Tipo.D);
//        ct.creaPrenotazione(Tipo.D);
//        ct.creaPrenotazione(Tipo.D);
//        ct.creaPrenotazione(Tipo.A);
        FrameTotem frameT = new FrameTotem(ct);
        FrameSportello frameS1 = new FrameSportello(cs);
        FrameSportello frameS2 = new FrameSportello(cs);
        
//        System.out.println(cs.toString());
//        System.out.println(coda.toString());
//        
//        System.out.println("----------------------------");
//        
//        System.out.println(g.prossimaPrenotazione());
//        System.out.println(g.prossimaPrenotazione());
//        ts.start();
//        ts2.start();
//        ts.libera();
//        ts2.libera();
//        ts2.libera();
//        
//        System.out.println("----------------------------");
//        
//        System.out.println(coda.toString());
    }
    
}
