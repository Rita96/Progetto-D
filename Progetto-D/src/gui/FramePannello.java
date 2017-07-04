/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.ControlPannello;

/**
 *
 * @author riccardo
 */
public class FramePannello extends JFrame {

    ControlPannello cp;
    ArrayList<String> turni;
    JPanel panel;
    ArrayList<JLabel> label;
    JLabel l;

    public FramePannello(ControlPannello cp) {

      
        this.cp = cp;
        
        this.turni = new ArrayList<>();
       
        this.label = new ArrayList<>(5);
      
        initComponents();

    }

    private void initComponents() {

        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
       

        l = new JLabel("Ciao");
      
        for (int i = 0; i < 5; i++) {
            
            String str = "Label" + i;
            l = new JLabel(str);
            label.add(l);
            panel.add(label.get(i));
            
        }
      
        panel.add(l);
        add(panel);
    
        pack();
        setVisible(true);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
