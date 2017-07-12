/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidedelbuono
 */
public class LetturaCredenziali {
    
    public static List<Utente> letturaFileCredenziali(String percorso){
        List<Utente> credenziali = new  ArrayList<>();
        
        try{
           FileReader file = new FileReader(percorso);
           BufferedReader in = new BufferedReader(file);
           
           String line;
           while((line=in.readLine()) != null){
               
               String[] split = line.split("\t");
               
               Utente user = new Utente(split[0], split[1]);
               credenziali.add(user);
           }
            
           file.close();
           
        }catch(FileNotFoundException ex){
            System.out.println("File non trovato");
        }catch(IOException ex){
            System.out.println("Errore IO");
        }
        return credenziali;
    }
    
}
