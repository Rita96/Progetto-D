/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package totempackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import systempackage.Tipo;

/**
 *
 * @author Tonio_UniPv
 */
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

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case ("A (Singola Operazione)"): {
                ct.inviaTipologia(Tipo.A);
                break;
            }
            case ("B (Pagamenti e Prelievi)"): {
                ct.inviaTipologia(Tipo.B);
                break;
            }
            case ("C (Spedizioni)"): {
                ct.inviaTipologia(Tipo.C);
                break;
            }
            default:

        }

    }

}
