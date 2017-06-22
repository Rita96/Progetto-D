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
public class Sportello{
    
    int ID;
//    Tipo tipologia;
    boolean attivo;
    boolean libero;
    Prenotazione prenotazione;

    //costruttore di Sportello: viene passato come parametro solo il numero identificativo dello sportello
    public Sportello(int ID) {
        this.ID = ID;
//        this.tipologia = tipologia;
        this.attivo = true;
        this.libero = true;
    }
    
    //metodo che fa passare lo stato dello sportello da libero a occupato
    public synchronized void sonoOccupato(){
        this.libero = false;
    }
    
    //metodo che fa passare lo stato dello sportello da occupato a libero
    public synchronized void sonoDisponibile(){
        System.out.println("toc");
        this.libero = true;
    }
    
    //metodo che assegna una prenotazione a uno Sportello
    public synchronized void setPrenotazione(Prenotazione pren){
        this.prenotazione = pren;
    }

    @Override
    public String toString() {
        return "Sportello{" + "ID=" + ID + '}';
    }
   
    
}
