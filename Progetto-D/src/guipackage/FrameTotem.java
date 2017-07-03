/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import systempackage.ControlTotem;
import systempackage.Tipo;

/**
 *
 * @author riccardo
 */
public class FrameTotem extends JFrame{
    
    private ControlTotem ct;
    
    public FrameTotem(ControlTotem ct){
        this.ct = ct;
        
        JPanel pan = new JPanel();
        JButton tipoA = new JButton("A");
        ActionListener la = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ct.inviaTipologia(Tipo.A);
            }
        };
        tipoA.addActionListener(la);
        pan.add(tipoA);
        
        JButton tipoB = new JButton("B");
        ActionListener lb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ct.inviaTipologia(Tipo.B);
            }
        };
        tipoB.addActionListener(lb);
        pan.add(tipoB);
        
        add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize (500, 500);
    }
    
}

