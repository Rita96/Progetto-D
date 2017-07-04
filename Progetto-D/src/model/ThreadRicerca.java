/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.ControlSportello;

/**
 *
 * @author Utente
 */
public class ThreadRicerca extends Thread{
    
    Sportello sp;
    Coda coda;
    ControlSportello cs;
    
    //costruttore del ThreadSportello: ha come parametri il gestore a cui fa riferimento e il umero dello sportello
    public ThreadRicerca(Sportello sp, Coda coda, ControlSportello cs){
        this.sp = sp;
        this.coda = coda;
        this.cs = cs;
    }
 
    //metodo run del Thread
    @Override
    public void run(){
        
        coda.next(sp);
        cs.inviaStato();
        
    }
    
}
