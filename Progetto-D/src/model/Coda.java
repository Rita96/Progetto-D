/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 *
 * @author riccardo
 */
public class Coda {

    ArrayList<Prenotazione> listaprenotazioni;

    //costruttore di coda, inizializza un ArrayList vuoto e il numero di prenotazioni pari a zero
    public Coda() {
        this.listaprenotazioni = new ArrayList();
    }

    //metodo che aggiunge una preotazione passata come paramtro e la aggiunge alla coda (ArrayList)
    public synchronized void aggiungiPrenotazione(Prenotazione ticket) {
        listaprenotazioni.add(ticket);
        System.out.println(ticket);
    }

    //fornisce la prossima prenotazione nella lista
    public synchronized String next(Sportello sp) {

        if (listaprenotazioni.isEmpty()) {
            ThreadRicerca t = (ThreadRicerca) Thread.currentThread();
            t.interrupt();

        }

        while (listaprenotazioni.iterator().hasNext()) {

            for (int i = 0; i < listaprenotazioni.size(); i++) {

                if (listaprenotazioni.get(i).getTipologia() == sp.getTipologia()) {

                    try {

                        String ticket = listaprenotazioni.get(i).toString() + "\t-->\t" + "SP" + sp.getID();
                        sp.setLibero(false);
                        sp.setPrenotazione(listaprenotazioni.get(i));
                        listaprenotazioni.remove(listaprenotazioni.get(i));
                        System.out.println(ticket);
                        return ticket;

                    } catch (IndexOutOfBoundsException e) {

                    }

                    break;
                } else if (!listaprenotazioni.iterator().hasNext()) {

                    String ticket = listaprenotazioni.get(0).toString() + "\t-->\t" + "SP" + sp.getID();
                    sp.setLibero(false);
                    sp.setPrenotazione(listaprenotazioni.get(0));
                    listaprenotazioni.remove(listaprenotazioni.get(0));
                    System.out.println(ticket);
                    return ticket;

                }
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
}
