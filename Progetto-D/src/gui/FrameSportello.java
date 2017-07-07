/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import control.ControlSportello;

/**
 *
 * @author Tonio_UniPv
 */
public class FrameSportello extends JFrame implements ActionListener {

    Font font = new Font("Verdana", Font.BOLD, 12);
    Border bordoStd = BorderFactory.createLineBorder(Color.blue, 2);
    Border bordoBlack = BorderFactory.createLineBorder(Color.black, 2);
    String[] tipo = {"A (Singola Operazione)", "B (Pagamenti e Prelievi", "C (Spedizioni)", "Tutte le tipologie"};
    JFrame prenotazioneFrame;
    JComboBox tipologia;
    JTextField usernameTextField;
    JPasswordField passwordTextArea;
    JLabel prenotazioneLabel, usLabel, pasLabel;
    JPanel sportelloPanel, loginPanel, cardPanel;
    JButton logoutButton, nextButton, loginButton;
    ControlSportello cSportello;

    public FrameSportello(ControlSportello cSportello) {

        this.cSportello = cSportello;
        initComponents();

    }

    private void initComponents() {

        cardPanel = new JPanel(new CardLayout());
        sportelloPanel = new JPanel();
        loginPanel = new JPanel();
        sportelloPanel.setLayout(new BorderLayout());

        setTitle("Login Sportello " +cSportello.getSportello().getID());    //provvisorio
        setSize(300, 200);
        setResizable(false);

        initSportelloPanel();

        cardPanel.add(sportelloPanel, "sportello");

        initLoginPanel();
        cardPanel.add(loginPanel, "login");

        add(cardPanel);

        CardLayout cl = (CardLayout) cardPanel.getLayout();
        cl.show(cardPanel, "login");

        
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void creaFramePrenotazione(JLabel prenotazione) {

        prenotazioneFrame = new JFrame("Prenotazione");
        JPanel panel = new JPanel();
        JLabel label = new JLabel(prenotazione.getText());
        label.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.setBackground(Color.yellow);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(label);
        prenotazioneFrame.add(panel);
        prenotazioneFrame.setLocation(1000, 300);

        prenotazioneFrame.setVisible(true);
        prenotazioneFrame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        String username = usernameTextField.getText();
        String password = new String(passwordTextArea.getPassword());

        switch (comando) {
            case ("Prossimo cliente"):
                cSportello.inviaStato();
                break;
            case ("Login"):
                if (cSportello.inviaCredenziali(username, password)) {
                    cSportello.setAttivo(true);

                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    creaFramePrenotazione(prenotazioneLabel);
                    cardLayout.show(cardPanel, "sportello");
                    setTitle("Sportello " +cSportello.getSportello().getID());
                } else {

                    passwordTextArea.setText("");
                    usernameTextField.setText("");
                    showInvalidUsernameMessage();

                }
                break;
            case ("Logout"):
                cSportello.setAttivo(false);
                ;
                passwordTextArea.setText("");
                usernameTextField.setText("");

                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                prenotazioneFrame.dispose();
                cardLayout.show(cardPanel, "login");
                setTitle("Login Sportello " +cSportello.getSportello().getID());
                break;
            default:
                break;
        }

    }

    private void initLoginPanel() {
        loginPanel.setLayout(null);
        
        usLabel = new JLabel("Username");
        usLabel.setBounds(30, 20, 80, 25);
        usLabel.setFont(font);
        usLabel.setForeground(Color.blue);
        loginPanel.add(usLabel);

        pasLabel = new JLabel("Password");
        pasLabel.setBounds(30, 80, 80, 25);
        pasLabel.setFont(font);
        pasLabel.setForeground(Color.blue);
        loginPanel.add(pasLabel);

        usernameTextField = new JTextField(20);
        usernameTextField.setBounds(120, 20, 150, 20);
        usernameTextField.setFont(font);
        usernameTextField.setBorder(bordoStd);
        loginPanel.add(usernameTextField);

        passwordTextArea = new JPasswordField(20);
        passwordTextArea.setBounds(120, 80, 150, 20);
        passwordTextArea.setFont(font);
        passwordTextArea.setBorder(bordoStd);
        loginPanel.add(passwordTextArea);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 120, 100, 40);
        loginButton.setFont(font);
        loginButton.addActionListener(this);

        loginPanel.add(loginButton);
    }

    private void initSportelloPanel() {
        sportelloPanel.setBackground(Color.yellow);
        sportelloPanel.setLayout(new GridLayout(4, 1));

        tipologia = new JComboBox(tipo);

        prenotazioneLabel = new JLabel("Etichetta Prenotazione");
        prenotazioneLabel.setFont(font);
        prenotazioneLabel.setHorizontalAlignment(JLabel.CENTER);

        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(this);
        logoutButton.setFont(font);

        nextButton = new JButton("Prossimo Cliente");
        nextButton.setFont(font);
        nextButton.setBounds(70, 40, 160, 70);
        nextButton.addActionListener(this);

        sportelloPanel.add(nextButton);
        sportelloPanel.add(prenotazioneLabel);
        sportelloPanel.add(tipologia);

        sportelloPanel.add(logoutButton);

    }

    private void showInvalidUsernameMessage() {
        JFrame errorMessage = new JFrame("Invalid username or password");
        errorMessage.setLayout(new GridLayout(2, 1));
        JLabel errorLabel = new JLabel("Username o password errate");
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                errorMessage.dispose();
            }
        });
        errorMessage.add(errorLabel);
        errorMessage.add(okButton);
        errorMessage.setVisible(true);
        errorMessage.pack();

    }

}
