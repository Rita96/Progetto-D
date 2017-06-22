/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author riccardo
 */
//classe per ora inutilizzata
public class ControlSportello {
    
    Map tabellaST;
    
    //costruttore ControlSportello, si farà riferimento ai thread a partire dal loro numero associato
    public ControlSportello() {
        this.tabellaST = new HashMap<Integer, ThreadSportello>();
    }
    
    //quando viene creato un nuovo thread, associa il numero dello sportello al thread
    public void aggiungiAssociazione(int num, ThreadSportello ts){
        tabellaST.put(num, ts);
    }
    
    //chiamato quando uno sportello viene liberato
    public void liberaSportello(int num){
        ThreadSportello threadselezionato = (ThreadSportello) tabellaST.get(num);
        System.out.println("toc");
        threadselezionato.libera();
    }
}

//    public ArrayList<Sportello> listasportelli = new ArrayList();
//    static int nSportello = 0;
    
    
//    public static Sportello creaSportello(){
//        Sportello sportello = new Sportello(++nSportello);
////        listasportelli.add(sportello);
//        return sportello;
//    }

//    @Override
//    public String toString() {
//        String str = "";
//        for(Sportello s : listasportelli){
//            str += s.toString()+"\n";
//        }
//        return str;
//    }
