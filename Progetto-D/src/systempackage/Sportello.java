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

    public Sportello(int ID) {
        this.ID = ID;
//        this.tipologia = tipologia;
        this.attivo = true;
        this.libero = true;
    }
    
    public synchronized void sonoOccupato(){
        this.libero = false;
    }
    
    public synchronized void sonoDisponibile(){
        this.libero = true;
    }

    @Override
    public String toString() {
        return "Sportello{" + "ID=" + ID + '}';
    }
   
    
}
