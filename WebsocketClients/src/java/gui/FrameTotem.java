/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import control.ControlTotem;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tonio_UniPv
 */

//aggiunta di commento

public class FrameTotem extends JFrame implements ActionListener {

    ControlTotem ct;
    Font font = new Font("Verdana", Font.BOLD, 12);
    JPanel panel;
    JButton tipoA, tipoB, tipoC;

    public FrameTotem(ControlTotem ct) {

        this.ct = ct;
        initComponents();

    }

    public ControlTotem getCt() {
        return ct;
    }

    public void setCt(ControlTotem ct) {
        this.ct = ct;
    }

    private void initComponents() {

        setTitle("Totem");

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.setBackground(Color.yellow);

        tipoA = new JButton("A (Singola Operazione)");
        tipoA.addActionListener(this);
        tipoB = new JButton("B (Pagamenti e Prelievi)");
        tipoB.addActionListener(this);
        tipoC = new JButton("C (Spedizioni)");
        tipoC.addActionListener(this);

        tipoA.setFont(font);
        tipoB.setFont(font);
        tipoC.setFont(font);

        setResizable(false);
        setSize(300, 200);

        panel.add(tipoA);
        panel.add(tipoB);
        panel.add(tipoC);

        add(panel);
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case ("A (Singola Operazione)"): {
            try {
                ct.inviaTipologia(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrameTotem.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            case ("B (Pagamenti e Prelievi)"): {
            try {
                ct.inviaTipologia(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrameTotem.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            case ("C (Spedizioni)"): {
            try {
                ct.inviaTipologia(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrameTotem.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
            }
            default:

        }

    }

}
