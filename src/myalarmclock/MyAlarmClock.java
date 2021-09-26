/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalarmclock;

import java.awt.Dimension;

/**
 *
 * @author ANTONIO
 */
public class MyAlarmClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock clock = new Clock();
        clock.setSize(new Dimension(600,250));
        clock.setTitle("My Digital Clock");
        clock.setLocationRelativeTo(clock);
        clock.setVisible(true);
    }
    
}
