/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Totempackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Utente
 */


//classe principale del totem, contiene tutti i metodi e tutti gli attributi (solo contatori)
public class Totem {
    
    int contatoreA;
    Socket socket;
    
    public Totem() throws IOException{
        this.contatoreA = 0;
        
        this.socket = new Socket("localhost", 9090); 
//      per ora funziona in locale, il socket viene creato nel costruttore
    }
    
//  metodo che richiama il metodo sendTicket e aggiorna il contatore a seconda della tipologia della prenotazione richiesta
    public void emanaTicket(String tipologia) throws IOException{
        
        switch(tipologia){
            case("A"):
                sendTicket(tipologia, contatoreA);
                contatoreA++;
                break;
            default:
                System.out.println("Tipologia non riconosciuta");
                break;
//              per ora ho implementato solo la tipologia A
        }
            
    }   
        
//  il metodo seguente crea una stringa con tipologia e numero separati da trattino basso e poi la invia al server
    private void sendTicket(String tipo, int contatore) throws IOException{
        
        String messaggio = tipo + "_" + contatore;
        
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(messaggio);
        
        
    }
    
    
}
