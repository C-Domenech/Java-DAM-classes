/*
 * Copyright (C) 2020 Cristina Domenech <linkedin.com/in/c-domenech/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
