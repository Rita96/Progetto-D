/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage.pannello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 * Single row of the Main Container panel
 * @author davidedelbuono
 */
public class TicketPanel extends JPanel {
    
    private JLabel label1;
    private JLabel label2;
    
    public TicketPanel(){
        super();
        label1 = new JLabel("", SwingConstants.CENTER);
        label2 = new JLabel("label2", SwingConstants.CENTER);
        
        setLayout(new BorderLayout());
        setLayout(new GridLayout(1, 2));
        
        add(label1, BorderLayout.WEST);
        add(label2, BorderLayout.EAST);
    }
    
    public void setConfig(){
        setVisible(true);
        setOpaque(true);
        
        Border bL = BorderFactory.createMatteBorder(3, 3, 3, 0, Color.blue);
        Border bR = BorderFactory.createMatteBorder(3, 0, 3, 3, Color.blue);
        Font f = new Font("Arial", Font.BOLD, 18);
        
        label1.setBorder(bL);
        label1.setBackground(Color.white);
        label1.setFont(f);
        label1.setForeground(Color.blue);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        
        label2.setBorder(bR);
        label2.setBackground(Color.white);
        label2.setFont(f);
        label2.setForeground(Color.black);
        label2.setVerticalAlignment(SwingConstants.CENTER);
    
    }
    
    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }
       
}
