/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Utente
 */
public class ServerSportello extends Thread{
    
    ServerSocket listener;
    Gestore gestore;
    int numerosportelli;
    ControlSportello controlS;

    //costruttore che inizializza la porta del socket e il numero degli sportelli pari a 0
    public ServerSportello(Gestore gestore, ControlSportello controlS) {
        try{
            this.listener = new ServerSocket(9090);
            this.gestore = gestore;
            this.controlS = controlS;
            this.numerosportelli = 0;
        }catch(IOException e){
            
        }
    }
    
    //metodo run che rimane sempre in esecuzione: il server attende una connessione, quando la ottiene crea il thread per il nuovo sportello
    @Override
    public void run(){
            
        while (true) {
            try {
                Socket socket = listener.accept();
                creaThread(socket);
                socket.close();
            } catch (IOException ex) {
            }
        }
    }
    
    synchronized void creaThread(Socket socket) throws IOException{
        ThreadSportello ts = new ThreadSportello(gestore, ++numerosportelli);
        controlS.aggiungiAssociazione(numerosportelli, ts);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(numerosportelli);
        ts.start();
    }
}
