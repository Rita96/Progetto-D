/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Utente
 */
public class ThreadAggiunta extends Thread{
    
    Coda coda;
    Prenotazione p;
    
    //costruttore del ThreadAggiunta: ha come parametri il gestore a cui fa riferimento e il numero dello sportello
    public ThreadAggiunta(Coda coda, Prenotazione p){
        this.coda = coda;
        this.p = p;
    }
 
    //metodo run del Thread
    @Override
    public void run(){
        coda.aggiungiPrenotazione(p);
    }
    
}

