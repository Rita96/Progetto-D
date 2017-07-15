/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author riccardo
 */
public class Coda {

    private ArrayList<Prenotazione> listaprenotazioni;

    //costruttore di coda, inizializza un ArrayList vuoto e il numero di prenotazioni pari a zero
    public Coda() {
        this.listaprenotazioni = new ArrayList();
    }

    //metodo che aggiunge una preotazione passata come paramtro e la aggiunge alla coda (ArrayList)
    public synchronized void aggiungiPrenotazione(Prenotazione ticket) {
        listaprenotazioni.add(ticket);
        System.out.println("aggiunta " + ticket + " in coda");
    }

    //fornisce la prossima prenotazione nella lista
    public synchronized String next(int id, int tipo) {

        if (listaprenotazioni.isEmpty()) {
            
            return  "Nessuna Prenotazione";

        }

        Iterator itr = listaprenotazioni.iterator();
        Prenotazione tmp;

        while (itr.hasNext()) {

            tmp = (Prenotazione) itr.next();

            if (tmp.getTipologia().ordinal() == tipo) {

                try {

                    String ticket = tmp.toString() + "\t-->\t" + "SP" + id;

                    listaprenotazioni.remove(tmp);
                    System.out.println("prenotazione individuata " + ticket);
                    return ticket;

                } catch (IndexOutOfBoundsException e) {

                }
            } else if (!itr.hasNext()) {

                String ticket = listaprenotazioni.get(0).toString() + "\t-->\t" + "SP" + id;
                Gestore.getIstance().setMessaggioPannello(ticket);
                System.out.println(Gestore.getIstance().getMessaggioPannello());
                listaprenotazioni.remove(listaprenotazioni.get(0));
                System.out.println("prenotazione individuata " + ticket);
                return ticket;

            }
        }

        return "Nessuna prenotazione in Coda";

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Prenotazione p : listaprenotazioni) {
            sb.append(p + "\n");
        }

        return sb.toString();
    }

    public ArrayList<Prenotazione> getListaprenotazioni() {
        return listaprenotazioni;
    }

    public void setListaprenotazioni(ArrayList<Prenotazione> listaprenotazioni) {
        this.listaprenotazioni = listaprenotazioni;
    }

    
}
