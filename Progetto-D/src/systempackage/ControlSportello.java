/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systempackage;

import java.util.ArrayList;

/**
 *
 * @author riccardo
 */
public class ControlSportello {
    
    public ArrayList<Sportello> listasportelli = new ArrayList();
    int nSportello = 0;

    public ControlSportello() {
    }
    
    public void creaSportello(){
        Sportello sportello = new Sportello(++nSportello);
        listasportelli.add(sportello);
    }

    public ArrayList<Sportello> getListasportelli() {
        return listasportelli;
    }

    
    @Override
    public String toString() {
        String str = "";
        for(Sportello s : listasportelli){
            str += s.toString()+"\n";
        }
        return str;
            
    }
}
