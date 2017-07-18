/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author davidedelbuono
 */
public class GestoreTest {
    
    public GestoreTest() {
    }
    
 
   

    /**
     * Test of addInCoda method, of class Gestore.
     */
    @Test
    public void testAddInCoda() {

        int[] i = {5,0,0};
        Gestore.getIstance().setContaTipo(i);
        int result = Gestore.getIstance().addInCoda(0);
        Assert.assertThat(result, Is.is(6));
        
    }
    
    @Test
    public void testCambiaTipo(){
    
    Tipo result = Gestore.getIstance().cambiaTipo(1);
        Assert.assertThat(result, Is.is(Tipo.B));
    
    }

   
    
}
