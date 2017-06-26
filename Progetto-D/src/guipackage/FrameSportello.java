/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import systempackage.ControlSportello;
import systempackage.Tipo;

/**
 *
 * @author Utente
 */
public class FrameSportello extends JFrame{
    
    int numerosportello;
    ControlSportello controlS;
    
    //frame con due bottoni: uno per connettersi e l'altro per dichiarare la disponibilità
    //si ha bisogno del numero dello sportello associato per comunicare con il resto del sistema
    //controlS è il controllore degli sportelli necessario anch'esso per far funzionare il programma
    public FrameSportello(ControlSportello cs){
        this.controlS = cs;
        
        JPanel pan = new JPanel();
        JButton creasock = new JButton("connetti");
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Socket socket = new Socket("localhost", 9090);
                    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    numerosportello = parseInt(input.readLine());
                }catch (IOException ex){
                }
            }
        };
        creasock.addActionListener(l);
        pan.add(creasock);
        
        
        JButton libera = new JButton("finito");
        ActionListener l2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlS.liberaSportello(numerosportello);
            }
        };
        libera.addActionListener(l2);
        pan.add(libera);
        
        
        JButton tipoA = new JButton("Tipo A");
        ActionListener listenerTipoA = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlS.setTipo(numerosportello, Tipo.A);
            }
        };
        tipoA.addActionListener(listenerTipoA);
        pan.add(tipoA);
        
        JButton tipoB = new JButton("Tipo B");
        ActionListener listenerTipoB = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlS.setTipo(numerosportello, Tipo.B);
            }
        };
        tipoB.addActionListener(listenerTipoB);
        pan.add(tipoB);
        
        
        add(pan);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize (500, 500);
    }
    
}
