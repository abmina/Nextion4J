/*
 * Copyright (C) 2018 Abdallah Mina <abdallahmina2@hotmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.nex.config;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public class NexRTC {
    
    private final NexHardware nex;
    
    public NexRTC(){
        nex = NexHardware.getInstance();
    }
    
    /**
     * Sets the RTC time of Nextion screen
     * 
     * @param cal is passed to the function
     * @return 
     * @throws Exception 
     */
    public boolean writeRTCTime(Calendar cal) throws Exception{
        String year = cal.get(Calendar.YEAR) + "";
        String mon = cal.get(Calendar.MONTH) + "";
        String day = cal.get(Calendar.DAY_OF_MONTH) + "";
        String hour = cal.get(Calendar.HOUR_OF_DAY) + "";
        String min = cal.get(Calendar.MINUTE) + "";
        String sec = cal.get(Calendar.SECOND) + "";
        
        nex.sendCommand("rtc0=" + year);
        nex.sendCommand("rtc1=" + mon);
        nex.sendCommand("rtc2=" + day);
        nex.sendCommand("rtc3=" + hour);
        nex.sendCommand("rtc4=" + min);
        nex.sendCommand("rtc5=" + sec);
        
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Set the specific time unit
     * 
     * @param timeType used to specify the time unit to be changed
     * year - year
     * mon - month
     * day - day
     * hour - hour
     * min - minute
     * sec - second
     * @param number
     * @return true if the command was completed successfully
     * @throws Exception 
     */
    public boolean writeRTCTime(String timeType, int number) throws Exception{
        String cmd;
        
        switch(timeType){
            case "year":
                cmd = "rtc0=" + number;
                break;
            case "mon":
                cmd = "rtc1=" + number;
                break;
            case "day":
                cmd = "rtc2=" + number;
                break;
            case "hour":
                cmd = "rtc3=" + number;
                break;
            case "min":
                cmd = "rtc4=" + number;
                break;
            case "sec":
                cmd = "rtc5=" + number;
                break;
            default:
                return false;
        }
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Gets the RTC time for the nextion screen
     * 
     * @return a Calendar object with the RTC time
     * @throws Exception 
     */
    public Calendar readRTCTime() throws Exception{
        int year, mon, day, hour, min, sec;
        Calendar cal = Calendar.getInstance();
        
        nex.sendCommand("get rtc0");
        year = nex.receiveInt();
        
        nex.sendCommand("get rtc1");
        mon = nex.receiveInt();
        
        nex.sendCommand("get rtc2");
        day = nex.receiveInt();
        
        nex.sendCommand("get rtc3");
        hour = nex.receiveInt();
        
        nex.sendCommand("get rtc4");
        min = nex.receiveInt();
        
        nex.sendCommand("get rtc5");
        sec = nex.receiveInt();
        
        cal.set(year, mon, day, hour, min, sec);
        return cal;
    }
}
