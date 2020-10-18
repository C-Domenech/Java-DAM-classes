/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdomenech.clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Clock implements ActionListener {

    /**
     *Set current time
     * 
     * @return Array compount by current hours, minutes and seconds
     */
    public String getTimeClock() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        String time = df.format(date);
        return time;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
