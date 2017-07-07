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

    private List<Prenotazione> listaPrenotazione;
    private List<Sportello> listaSportelli;
    private static List<Utente> utenti;
    private int[] contaTipo;

    public Gestore(int numeroSportelli) {
        this.listaPrenotazione = new ArrayList<>();
        this.listaSportelli = new ArrayList<>();
        Gestore.utenti = LetturaCredenziali.letturaFileCredenziali("credenziali.txt");
//        for (int i = 0; i < contaTipo.length; i++) {
//            contaTipo[i] = 0;
//        }
    }

    public List<Prenotazione> getListaPrenotazione() {
        return listaPrenotazione;
    }

    public void setListaPrenotazione(List<Prenotazione> listaPrenotazione) {
        this.listaPrenotazione = listaPrenotazione;
    }

    public List<Sportello> getListaSportelli() {
        return listaSportelli;
    }

    public void setListaSportelli(List<Sportello> listaSportelli) {
        this.listaSportelli = listaSportelli;
    }

    public void next() {

        for (Prenotazione prenotazione : listaPrenotazione) {

            for (Sportello sportello : listaSportelli) {

                if (prenotazione.getTipologia() == sportello.getTipologia()) {

                    String turno = new String();

                }

            }

        }

    }

    public void inviaTurno() {

    }

    public Tipo riceviTipo() {

        return Tipo.NULL;

    }

    public void riceviStato() {

    }

    //in ingresso riceverà dal totem la tipologia tramite websocket
    public Prenotazione newPrenotazione(Tipo tipologia) {

        Prenotazione ticket = new Prenotazione(tipologia, ++this.contaTipo[convertiTipo(tipologia)]);
        return ticket;
    }

    //riceve lo stato e il numero dello sportello è lo aggiunge alla lista degli sportelli tramite websochet
    public void newSportello(Sportello s) {

        listaSportelli.add(s);

    }

    public static boolean checkLogin(String username, String password) {

        boolean check = false;

        for (int i = 0; i < utenti.size(); i++) {

            if (username.equalsIgnoreCase((utenti.get(i).getId())) && password.equalsIgnoreCase(utenti.get(i).getPassword())) {

                utenti.remove(utenti.get(i));
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

    public int convertiTipo(Tipo tipo) {
        switch (tipo) {
            case A:
                return 0;
            case B:
                return 1;
            case C:
                return 2;
            case D:
                return 3;
            default:
                return -1;
        }
    }

}
