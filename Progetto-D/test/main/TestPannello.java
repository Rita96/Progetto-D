/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.ControlPannello;
import gui.FramePannello;

/**
 *
 * @author Tonio_UniPv
 */
public class TestPannello {
    public static void main(String[] args) {
        
        ControlPannello cp = new ControlPannello();
        FramePannello fp = new FramePannello(cp);
        
        fp.aggiornaPannello("A1-->1");
        fp.aggiornaPannello("A3-->3");
        fp.aggiornaPannello("B2-->7");
        fp.aggiornaPannello("C1-->2");
        
        
    }
}
