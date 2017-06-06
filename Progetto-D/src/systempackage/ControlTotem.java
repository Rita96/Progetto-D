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
    
    int[] contanumero;
    
    public ControlTotem(){
        this.contanumero = new int[4];
        for(int i=0; i<contanumero.length; i++){
            contanumero[i] = 0;
        }
    }
    
    public void creaPrenotazione(Tipo tipologia){
        Prenotazione ticket = new Prenotazione(tipologia, ++this.contanumero[convertiTipo(tipologia)]);
        Coda.aggiungiPrenotazione(ticket);
    }
    
    public int convertiTipo(Tipo tipo){
        switch (tipo){
            case A:
                return 0;
            case B:
                return 1;
            case C:
                return 2;
            case D:
                return 3;
            default:
                return -1;
        }
    }
    
}

