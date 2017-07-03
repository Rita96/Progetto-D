/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riccardo
 */
public class Gestore {

    private List<Prenotazione> listaPrenotazione;
    private List<Sportello> listaSportelli;

    public Gestore() {
        this.listaPrenotazione = new ArrayList<>();
        this.listaSportelli = new ArrayList<>();

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

        //prossima prenotazione, la tipologia la invia il totem
    }

    public void inviaTurno() {

        //sever.sent invia al pannelo e sportello
    }

    //in ingresso riceverà dal totem la tipologia tramite websocket
    public void addPrenotazione(Tipo tipologia) {
        Prenotazione ticket = new Prenotazione(tipologia, 0);
        listaPrenotazione.add(ticket);
    }

    //riceve lo stato e il numero dello sportello è lo aggiunge alla lista degli sportelli tramite websochet
    public void addSportello(Sportello s) {

        s = new Sportello(0);
        listaSportelli.add(s);

    }

    public static boolean checkLogin(String username, String password) {

        if (username.equals("admin") && password.equals("admin")) {

            return true;

        }
        return false;

    }
}
