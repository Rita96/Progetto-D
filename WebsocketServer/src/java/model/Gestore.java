/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Riccardo Merlano
 * @author Piergiorgio Fedele
 *
 *
 */
/**
 * il gestore controlla l'elenco della {@link Coda} e degli sportelli e assegna
 * una nuova prenotazione allo {@link Sportello} che la richiede in base alla tipologia
 * dello sportello (nel caso lo sportello abbia una preferenza saranno prelevate
 * dalla coda prima le prenotazioni appartenenti a quella tipologia)
 *
 * 
 * 
 * @see Sportello
 * @see Tipo
 * @see Prenotazione
 * 
 */
public class Gestore {

    
    private static Gestore istance;
    /**
     * un array con la coda delle prenotazioni
     * @see Coda
     */
    private Coda coda;
    /**
     * elenco degli sportelli attivi
     *
     */
    private List<Sportello> listaSportelli;
    /**
     * lista degli utenti che possono accedere
     *
     */
    private static List<Utente> utenti;
    /**
     * un array di interi, ogni intero è un contatore per una tipologia diversa
     * di prenotazione
     *
     */
    private int[] contaTipo;
    /**
     * contiene il messaggio da mandare al pannello
     */
    private String messaggioPannello;

    private Gestore() {
        this.coda = new Coda();
        this.listaSportelli = new ArrayList<>();
        Gestore.utenti = LetturaCredenziali.letturaFileCredenziali("C:\\Users\\pierg\\Documents\\NetBeansProjects\\Progetto-D\\WebsocketServer\\credenziali.txt");
        this.contaTipo = new int[3];
        for (int i = 0; i < contaTipo.length; i++) {
            contaTipo[i] = 0;
        }
    }

//metodi get e set
    public static Gestore getIstance() {
        if (istance == null) {

            istance = new Gestore();

        }
        return istance;
    }

    public static void setIstance(Gestore istance) {
        Gestore.istance = istance;
    }

    public Coda getCoda() {
        return coda;
    }

    public void setCoda(Coda coda) {
        this.coda = coda;
    }

    public static List<Utente> getUtenti() {
        return utenti;
    }

    public static void setUtenti(List<Utente> utenti) {
        Gestore.utenti = utenti;
    }

    public int[] getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(int[] contaTipo) {
        this.contaTipo = contaTipo;
    }

    public List<Sportello> getListaSportelli() {
        return listaSportelli;
    }

    public void setListaSportelli(List<Sportello> listaSportelli) {
        this.listaSportelli = listaSportelli;
    }

    public String getMessaggioPannello() {
        return messaggioPannello;
    }

    public void setMessaggioPannello(String messaggioPannello) {
        this.messaggioPannello = messaggioPannello;
    }

    /**
     * data la tipologia di prenotazione aggiorna il contatore relativo
     *
     * @param tipo la tipologia di prenotazione che si vuole aggiungere in coda
     * @see #coda
     * @see #contaTipo
     * @return ritorna un intero che rappresenta il numero della prenotazione
     * effettuata (es. prenotazione A22, return 22)
     */
    public synchronized int addInCoda(int tipo) {

        int x = ++this.contaTipo[cambiaTipo(tipo).ordinal()];

        Prenotazione ticket = new Prenotazione(cambiaTipo(tipo), x);
        coda.aggiungiPrenotazione(ticket);

        System.out.println(ticket);

        return x;
    }

    /**
     *
     * controlla che username e password siano corretti inseriti siano corretti
     *
     * @see LetturaCredenziali
     *
     * @param username la stringa dello username
     * @param password la stringa della password
     * @return ritorna vero se username e password sono corretti
     *
     *
     */
    public boolean checkLogin(String username, String password) {

        boolean check = false;

        for (int i = 0; i < utenti.size(); i++) {

            if (username.equalsIgnoreCase((utenti.get(i).getId())) && password.equalsIgnoreCase(utenti.get(i).getPassword())) {

                check = true;

            }

        }

        return check;
    }

    /**
     * ritorna una lista di utenti che possono accedere
     *
     * @see Utente
     * @see #utenti
     * @return ritorna la lista in forma di String
     */
    public String stringUtenti() {
        String stringa = "";
        for (int i = 0; i < utenti.size(); i++) {
            stringa += utenti.get(i).toString() + "\n";
        }
        return stringa;

    }

    /**
     * converte un intero in un {@link Tipo}
     *
     * @param tipo un intero che verrà convertito in una tipologia
     * @return ritorna la tipologia convertita
     *
     *
     *
     */
    public Tipo cambiaTipo(int tipo) {

        switch (tipo) {

            case (0): {
                return Tipo.A;

            }
            case (1): {

                return Tipo.B;

            }
            case (2): {

                return Tipo.C;

            }

            default:
                return Tipo.NULL;
        }

    }

}
