/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guipackage;

import Totempackage.Totem;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Utente
 */


//interfaccia grafica semplice che contiene 4 bottoni, con relativi listener "modificati" (vedere classe buttonListener)
public class Totemface extends JFrame{
    
    public Totemface(Totem totem){
        
        setTitle("Totem");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));
        
        JButton buttonA = new JButton("A");
        buttonListener listener = new buttonListener(totem);
        buttonA.addActionListener(listener);
        
//      per ora funziona solo A
        
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");
        
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(buttonC);
        panel.add(buttonD);
        
        add(panel);
       
        setSize(300,200);
        setLocation(500,250);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    
}
