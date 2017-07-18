/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pierg
 */
public class CodaNextTest {

    public CodaNextTest() {
    }

    @Test
    public void nessunaPrenotazione() {

        Coda c = new Coda();
        String result = c.next(1, 0);
        assertEquals("Nessuna Prenotazione", result);
        System.out.println("Nessuna prenotazione");

    }

    @Test
    public void prenotazione() {

        Coda c = new Coda();
        Prenotazione p = new Prenotazione(Tipo.A, 1);
        c.getListaprenotazioni().add(p);
        String result = c.next(1, 0);

        assertThat(p.toString() + "\t-->\t" + "SP" + 1, Is.is(result));
    }

}
