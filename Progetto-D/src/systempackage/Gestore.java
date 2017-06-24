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
    
    //metodo che fa partire la procedura per la prossima prenotazione
    public void prossimaPrenotazione(Sportello sp, ControlSportello cs){
        ThreadRicerca tr = new ThreadRicerca(sp, coda, cs);
        tr.start();
    }
    
    //metodo che fa partire la procedura per aggiungere una prenotazione alla lista
    public void nuovaPrenotazione(Prenotazione p){
        ThreadAggiunta tr = new ThreadAggiunta(coda, p);
        tr.start();
    }
    
    
}
