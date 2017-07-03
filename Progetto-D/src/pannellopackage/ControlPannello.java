/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pannellopackage;

import systempackage.Prenotazione;

/**
 *
 * @author riccardo
 */
public class ControlPannello {

    private String turno;
    private FramePannello fp;

    public ControlPannello() {
        
        fp = new FramePannello();

    }

    public void mostraTurno(String turno) {

    }

    public String riceviTurno() {

        //client.receive riceve dal gestore la compo sportello turno da mostrare
        return turno;
    }

}
