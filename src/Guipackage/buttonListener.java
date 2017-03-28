/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guipackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Totempackage.Totem;
import java.io.IOException;


/**
 *
 * @author Utente
 */

//vengono chiamati con il parametro totem per essere in grado di chiamare il metodo "emanaTicket"
class buttonListener implements ActionListener{
    
    Totem totem;
    
    public buttonListener(Totem tot){
        this.totem = tot;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        try {
            totem.emanaTicket("A");
        } catch (IOException ex) {
            System.out.println("errore IO");
            System.exit(-1);
        }
        
    }

}
