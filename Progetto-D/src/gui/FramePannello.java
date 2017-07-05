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
import java.awt.Font;
import javax.swing.border.Border;

/**
 *
 * @author riccardo
 */
public class FramePannello extends JFrame {

    private ControlPannello cp;
    private ArrayList<String> turni;
    private JPanel panel;
    private ArrayList<JLabel> label;
    private JLabel l;

    public FramePannello(ControlPannello cp) {

        this.cp = new ControlPannello();
        
        this.turni = new ArrayList<>();

        this.label = new ArrayList<>(5);

        initComponents();

    }

    private void initComponents() {

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        

        for (int i = 0; i < 5; i++) {

            
            l = new JLabel("LABEL " +(i+1));
            l.setFont(new Font("Verdana", Font.BOLD, 12));
            label.add(l);
            panel.add(label.get(i));

        }

        panel.add(l);
        add(panel);

        pack();
        setVisible(true);
        setLocation(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
