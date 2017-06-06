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
public class ControlTotem {
    
    int contanumero;
    
    public ControlTotem(){
        this.contanumero = 0;
    }
    
    public void creaPrenotazione(Tipo tipologia){
        Prenotazione ticket = new Prenotazione(tipologia, this.contanumero);
        Coda.aggiungiPrenotazione(ticket);
    }
    
}

