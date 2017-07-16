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
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import src.WebsocketPannello;

/**
 *
 * @author Riccardo Merlano
 * @author Antonio Minolfi
 * 
 * rappresenta il dispositivo che si occupa di tenere traccia delle prenotazioni
 * attuali, per aiutare il cliente ad identificare lo sportello dove potrà
 * richiedere i servizi
 */

public class FramePannello extends JFrame {

    private ControlPannello cp;
    private ArrayList<String> turni;
    private JPanel panel;
    private ArrayList<JLabel> label;
    private JLabel l;
    private JLabel etichetta;
    Border bordoStd = BorderFactory.createLineBorder(Color.blue, 2);
    private Font font = new Font("Verdana", Font.BOLD, 30);

    public FramePannello(ControlPannello cp) {

        this.cp = cp;

        this.turni = new ArrayList<>();

        this.label = new ArrayList<>(5);

        initComponents();

        prossimoTurno();

    }
    
    /**
     * metodo che inizializza i componenti grafici
     */

    private void initComponents() {

        etichetta = new JLabel("Prenotazione-->Sportello", SwingConstants.CENTER);
        etichetta.setBounds(50, 10, 500, 60);
        etichetta.setFont(font);
        etichetta.setForeground(Color.blue);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.yellow);

        panel.add(etichetta);

        int y = 70;
        for (int i = 0; i < 5; i++) {

            l = new JLabel("------", SwingConstants.CENTER);
            l.setFont(font);
            l.setForeground(Color.blue);
            l.setBounds(160, y, 260, 60);
            l.setBorder(bordoStd);
            label.add(l);
            panel.add(label.get(i));
            y += 80;

        }

        panel.add(l);
        add(panel);
        setSize(600, 500);
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * metodo che cambia l'elenco delle stringhe visualizzate
     * l'ultima stringa ricevuta diventa la prima e le altre scalano verso il
     * basso
     * @param nextPrenotazione la nuova stringa da aggiungere
     * @see #aggiornaPannello
     */
    
    public void prossimoTurno() {

        cp.riceviTurno(new WebsocketPannello.MessageHandler() {
            @Override
            public void handleMessage(String message) {

                aggiornaPannello(message);

            }
        });

    }

    public void aggiornaPannello(String s) {

        label.get(4).setText(label.get(3).getText());
        label.get(3).setText(label.get(2).getText());
        label.get(2).setText(label.get(1).getText());
        label.get(1).setText(label.get(0).getText());
        label.get(0).setText(s);

    }

}
