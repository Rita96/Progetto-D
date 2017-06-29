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
 * Main container panel
 * @author davidedelbuono
 */

public class MainPanel extends JPanel{
    
    private TicketPanel ticket1, ticket2, ticket3, ticket4;
    private JPanel intestationPanel;
    private JPanel ticketPanel;
    

    public MainPanel() {
        super();
        initComponents();
    }
    
    public void initComponents(){  
        
        this.setLayout(new BorderLayout());
        
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
                
        ticket1 = new TicketPanel();
        ticket2 = new TicketPanel();
        ticket3 = new TicketPanel();
        ticket4 = new TicketPanel();
        
        ticket1.setConfig();
        ticket1.getLabel1().setText("1");
        ticket2.setConfig();
        ticket2.getLabel1().setText("2");
        ticket3.setConfig();
        ticket3.getLabel1().setText("3");
        ticket4.setConfig();
        ticket4.getLabel1().setText("4");
        
        
        intestationPanel = new JPanel();
        ticketPanel = new JPanel();

        
        intestationPanel.setLayout(new GridLayout(1,2));
        ticketPanel.setLayout(new GridLayout(4, 1));
        
        JLabel nSportello = new JLabel("nSportello", SwingConstants.CENTER);
        nSportello.setVerticalAlignment(SwingConstants.CENTER);
        nSportello.setFont(new Font("Arial", Font.BOLD, 18));
        nSportello.setBorder(border);
        nSportello.setOpaque(true);
        nSportello.setBackground(Color.yellow);
        
        JLabel numero = new JLabel("Numero", SwingConstants.CENTER);
        numero.setVerticalAlignment(SwingConstants.CENTER);
        numero.setFont(new Font("Arial", Font.BOLD, 18));
        numero.setBorder(border);
        numero.setOpaque(true);
        numero.setBackground(Color.yellow);
        
        intestationPanel.add(nSportello, BorderLayout.WEST);
        intestationPanel.add(numero, BorderLayout.EAST);
        
        ticketPanel.add(ticket1);
        ticketPanel.add(ticket2);
        ticketPanel.add(ticket3);
        ticketPanel.add(ticket4);
        
        this.add(intestationPanel, BorderLayout.NORTH);
        this.add(ticketPanel, BorderLayout.CENTER);
    }
    
}
