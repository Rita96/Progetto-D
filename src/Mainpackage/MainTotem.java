package Mainpackage;

import Guipackage.Totemface;
import Totempackage.Totem;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */



//semplice main che fa partire l'interfaccia grafica e istanzia un oggetto tipo totem (che contiene metodi e contatori)

public class MainTotem {
    
    public static void main(String[] args) throws IOException {
        
        Totem tot = new Totem();
        
        Totemface graphic = new Totemface(tot);
    }
    
}
