/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.ControlSportello;
import gui.FrameSportello;
import model.Gestore;
import model.Sportello;
import model.Tipo;

/**
 *
 * @author pierg
 */
public class TestSportello1 {
   
    public static void main(String[] args) {
        
        Gestore g = new Gestore(1);
        Sportello sp1 = new Sportello(1,Tipo.A);
        FrameSportello frameSportello1 = new FrameSportello(new ControlSportello(sp1));
        
    }
    
}
