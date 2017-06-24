/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author riccardo
 */
//classe per ora inutilizzata
public class ControlSportello {
    
    ArrayList<Sportello> listasportelli;
    Gestore gestore;
    
    //costruttore ControlSportello, si farà riferimento ai thread a partire dal loro numero associato
    public ControlSportello(Gestore g) {
        this.listasportelli = new ArrayList();
        this.gestore = g;
    }
    
    //viene creato un nuovo sportello e aggiunto alla lista
    public void aggiungiSportello(int num){
        Sportello nuovosportello = new Sportello(num);
        listasportelli.add(nuovosportello);
    }
    
    //chiamato quando uno sportello viene liberato
    public void liberaSportello(int num){
        Iterator itr = listasportelli.iterator();
        Sportello buff;
      
        while(itr.hasNext()) {
            buff = (Sportello) itr.next();
            if(buff.ID==num)
                buff.sonoDisponibile();
                gestore.prossimaPrenotazione(buff, this);
        }
    }

    void inviaPrenotazione(Sportello sp) {
        //invia la prentoazione giusta allo sportello
    }
}

