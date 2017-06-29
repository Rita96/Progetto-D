/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage.pannello;

import javax.swing.JFrame;

/**
 * Main Frame
 * @author davidedelbuono
 */
public class MainFrame extends JFrame {
    
    private MainPanel pannello;
    
    public MainFrame(){
        
        super();
        
        this.setTitle("Pannello prenotazioni");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.pannello = new MainPanel();

        pannello.setVisible(true);
        
        pannello.initComponents();    
        
        
        
        this.add(pannello);
    }
       
}
