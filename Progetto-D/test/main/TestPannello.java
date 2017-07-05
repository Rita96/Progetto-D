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
        
        fp.aggiornaPannello("A001\t-->\tSP01");
        fp.aggiornaPannello("A003\t-->\tSP03");
        fp.aggiornaPannello("B002\t-->\tSP07");
        fp.aggiornaPannello("C001\t-->\tSP02");
        
        
    }
}
