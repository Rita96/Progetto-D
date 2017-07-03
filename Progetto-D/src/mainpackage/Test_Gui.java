/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import guipackage.FrameSportello;
import systempackage.ControlSportello;
import systempackage.Sportello;

/**
 *
 * @author pierg
 */
public class Test_Gui {

    public static void main(String[] args) {

        Sportello s = new Sportello(1);
        ControlSportello controlSportello = new ControlSportello(s);
        FrameSportello frameSportello = new FrameSportello(controlSportello);

    }

}
