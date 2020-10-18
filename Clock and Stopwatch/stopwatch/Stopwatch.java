/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdomenech.stopwatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Stopwatch implements ActionListener {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    private int elapsedTime = 0;

    String hoursString = String.format("%02d", hours);
    String minutesString = String.format("%02d", minutes);
    String secondsString = String.format("%02d", seconds);

    /**
     * Set formatted current stopwatch time
     *
     * @return Array compount by actual hours, minutes and seconds
     */
    public String[] getTime() {
        elapsedTime += 1000;
        hours = (elapsedTime / 3600000);
        minutes = (elapsedTime / 60000) % 60;
        seconds = (elapsedTime / 1000) % 60;

        hoursString = String.format("%02d", hours);
        minutesString = String.format("%02d", minutes);
        secondsString = String.format("%02d", seconds);
        String[] timeArr = {hoursString, minutesString, secondsString};
        return timeArr;
    }

    /**
     * Reset time variables
     *
     * @return Array compound by reseted variables
     */
    public String[] resetTime() {
        hours = 0;
        minutes = 0;
        seconds = 0;
        elapsedTime = 0;
        hoursString = String.format("%02d", hours);
        minutesString = String.format("%02d", minutes);
        secondsString = String.format("%02d", seconds);

        String[] resetedTimeArr = {hoursString, minutesString, secondsString};
        return resetedTimeArr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
