/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.ControlPannello;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;

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
    private Font font = new Font("Verdana", Font.BOLD, 30);

    public FramePannello(ControlPannello cp) {

        this.cp = new ControlPannello();

        this.turni = new ArrayList<>();

        this.label = new ArrayList<>(5);

        initComponents();

    }

    private void initComponents() {

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (int i = 0; i < 5; i++) {

            panel.add(new JSeparator());
            l = new JLabel("LABEL " + (i + 1));
            l.setFont(font);
            l.setHorizontalAlignment(JLabel.CENTER);
            label.add(l);
            panel.add(label.get(i));

        }

        panel.add(l);
        add(panel);

        setLocation(600, 300);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void aggiornaPannello(String nextPrenotazione) {

        label.get(4).setText(label.get(3).getText());
        label.get(3).setText(label.get(2).getText());
        label.get(2).setText(label.get(1).getText());
        label.get(1).setText(label.get(0).getText());
        label.get(0).setText(nextPrenotazione);
    }

}
