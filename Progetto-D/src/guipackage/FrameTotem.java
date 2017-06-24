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
    
    ControlTotem ct;
    
    public FrameTotem(ControlTotem ct){
        this.ct = ct;
        
        JPanel pan = new JPanel();
        JButton tipoA = new JButton("A");
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ct.creaPrenotazione(Tipo.A);
            }
        };
        tipoA.addActionListener(l);
        pan.add(tipoA);
        
        add(pan);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize (500, 500);
    }
    
}

