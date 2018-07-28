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



/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public class NexGPIO{
    
    private final NexHardware nex;
    
    public NexGPIO(){
        nex = NexHardware.getInstance();
    }
    
    /**
     * Configures the GPIO port to either input and output
     * 
     * @param port is the port number that needs to be configured
     * @param mode is the I/O mode of the pin
     * 0 - pull up input mode
  1  * 1 - input binding mode
  2  * 2 - push pull output mode
  3  * 3 - PWM output mode
  4  * 4 - open drain output mode
     * @return true if the command was completed successfully
     * @throws Exception 
     */
    public boolean pinMode(int port, int mode) throws Exception{
        String cmd = "cfgpio " + port + "," + mode + ",0";
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Writes a value to the GPIO port specified
     * @param port to be written to
     * @param value value to be written
     * @return true if the command was completed successfully
     * @throws Exception 
     */
    public boolean digitalWrite(int port, int value) throws Exception{
        String cmd = "pio" + port + "=" + value;
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Reads the value of the GPIO port specified
     * 
     * @param port to be read from
     * @return the value of the GPIO port
     * @throws Exception 
     */
    public int digitalRead(int port) throws Exception{
        String cmd = "get pio" + port;
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * Writes analog signal to the specified port
     * 
     * @param port to be written to
     * @param value to be written to the port
     * @return true if the command is completed successfully
     * @throws Exception 
     */
    public boolean analogWrite(int port, int value) throws Exception{
        String cmd = "pwm" + port + "=" + value;
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Sets the PMW carrier frequency 
     * 
     * @param value is the frequency of the PWM
     * @return true if the command was completed successfully
     * @throws Exception 
     */
    public boolean setPWMFreq(int value) throws Exception{
        String cmd = "pwmf=" + value;
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * Gets the PWM carrier frequency
     * 
     * @return the value of the PWM frequency
     * @throws Exception 
     */
    public int getPWMFreq() throws Exception{
        String cmd = "get pwmf";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
}
