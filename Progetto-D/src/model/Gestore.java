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
 * @author riccardo
 */
public class Gestore {

    private Coda coda;
    private List<Sportello> listaSportelli;
    private static List<Utente> utenti;
    private int[] contaTipo;

    public Gestore(int numeroSportelli) {
        this.coda = new Coda();
        this.listaSportelli = new ArrayList<>();
        Gestore.utenti = LetturaCredenziali.letturaFileCredenziali("credenziali.txt");
        this.contaTipo = new int[3];
        for (int i = 0; i < contaTipo.length; i++) {
            contaTipo[i] = 0;
        }
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

    public void inviaTurno(Sportello sp) {

        coda.next(sp);

    }

    public Tipo riceviTipo() {

        return Tipo.NULL;

    }

    public void riceviStato() {

    }

    public void addInCoda(Tipo tipologia) {

        Prenotazione ticket = new Prenotazione(tipologia, ++this.contaTipo[tipologia.ordinal()]);
        coda.aggiungiPrenotazione(ticket);
        System.out.println(ticket);

    }

    public static boolean checkLogin(String username, String password) {

        boolean check = false;

        for (int i = 0; i < utenti.size(); i++) {

            if (username.equalsIgnoreCase((utenti.get(i).getId())) && password.equalsIgnoreCase(utenti.get(i).getPassword())) {

                check = true;

            }

        }

        return check;
    }

    public String stringUtenti() {
        String stringa = "";
        for (int i = 0; i < utenti.size(); i++) {
            stringa += utenti.get(i).toString() + "\n";
        }
        return stringa;

    }

}
