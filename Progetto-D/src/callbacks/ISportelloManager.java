/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbacks;

import model.Prenotazione;

/**
 *
 * @author pierg
 */
public interface ISportelloManager {
    
    void onNextReservation(Prenotazione prenotazione);
    
}