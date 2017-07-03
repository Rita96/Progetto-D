/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pannellopackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import systempackage.Prenotazione;
import systempackage.Sportello;

/**
 *
 * @author riccardo
 */
public class ControlPannello {
    
    
    Map<String, String> righePannello;

    //costrttore di ControlPannello: inizializza una hashmap
    public ControlPannello() {
        this.righePannello = new HashMap<String, String>();
    }
    
    //aggiunge una prenotazione alla hashmap
    public void aggiungiPrenotazione(Prenotazione prenotazione, Sportello sportello){
        String p = "";
        String s = "";
        
        p = prenotazione.toString();
        s = Integer.toString(sportello.getID());
        
        righePannello.put(p, s);
        
    }
    
    //rimuove una prenotazione dalla hashmap
    public void rimuoviPrenotazione(Prenotazione prenotazione){
        righePannello.remove(prenotazione.toString());
    }
    
    //classe di test per stampare le righe che saranno visualizzate sul pannello
    public void stampaRighePannello(){
        
        System.out.println("Prenotazione\tSportello");
        Iterator it = righePannello.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            
            String p = "";
            String s = "";
            
            p = (String) entry.getKey();
            s = (String) entry.getValue();
            
            System.out.println(p+"\t\t"+s);
        }
        
    }
            
    
    
}
