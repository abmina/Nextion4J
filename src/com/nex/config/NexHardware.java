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

import com.fazecast.jSerialComm.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public final class NexHardware implements Constants {
    
    private static final NexHardware hardware = new NexHardware();
    
    private SerialPort commPort;
    private boolean commSet = false;
    private InputStream in;
    private OutputStream out;
    
    /**
     * default constructor
     */
    private NexHardware(){
        if(openPort()){
            in = commPort.getInputStream();
            out = commPort.getOutputStream();
        }
    }
    
    /**
     * takes an SerialPort object and sets the Serial port of the 
     * Hardware object
     * 
     * @param commPort it the port passed from the calling class
     */
    public void setCommPort(SerialPort commPort){
        this.commPort = commPort;
        commSet = true;
    }
    
    /**
     * 
     * @return the static instance of the NexHardware created by this class
     */
    public static NexHardware getInstance(){
        return hardware;
    }
    
    /**
     * use setCommPort() to pass a port to set a port before you use this method
     * if the port is already set the the function will attempt to open the port
     * 
     * @return true if the port is opened and returns false if the port couldn't
     * be opened.
     */
    public boolean openPort(){
        if(commSet){
            return commPort.openPort();
        }
        else{
            return false;
        }
    }
    
    /**
     * closes the com port
     */
    public void closePort(){
        commPort.closePort();
    }
    
    /**
     * attempts to send the command to the Nextion screen 
     * 
     * @param cmd is the command that will be send to the screen
     * @throws Exception if the data couldn't be sent
     */
    public void sendCommand(String cmd) throws Exception{
        if(commPort.isOpen()){
            out.write(cmd.getBytes());
            out.flush();
            out.write(0xff);
            out.write(0xff);
            out.write(0xff);
        }
    }
    
    /**
     * receives the string value form the screen
     * 
     * @return the string value or invalid if the returned vale was not a string
     * @throws Exception 
     */
    public String receiveText() throws Exception{
        byte[] b = new byte[1024];
        String data = "";
        int count = 0;
        if(in.available() > 0){
            in.read(b); 
            if(b[0] == 0x70){
                for(int i = 1; i < b.length; i++){
                    data += (char)b[i];
                    if(b[i] == (byte)0xff){
                        count++;
                    }
                    if(count >= 3){
                        break;
                    }   
                }
            }
            else return "invalid";
        }
        else{
            return "invalid";
        }
        return data.substring(0, data.length() - 3);
    }
    
    /**
     * receives the 32bit integer from screen 
     * 
     * @return the 32bit integer value and returns 
     * @throws Exception 
     */
    public int receiveInt() throws Exception{
        byte[] b = new byte[8];
        int data = 0;
        if(in.available() > 0){
            in.read(b);
            if(b[0] == 0x71 && b[5] == (byte)0xFF && b[6] == (byte)0xFF 
                    && b[7] == (byte)0xFF){
                data = ((b[4] & 0xff) << 24) | ((b[3] & 0xff) << 16) 
                        | ((b[2] & 0xff) << 8) | ((b[1] & 0xff));
            }
        } 
        return data;
    }
    
    /**
     * receives the finish command from the nextion screen
     * 
     * @return true if the operation was finished and false otherwise
     * @throws Exception 
     */
    public boolean receivedFinishedCommand() throws Exception{
        byte[] b = new byte[8];
        if(in.available() > 0){
            in.read(b);
            if(b[0] == NEX_RET_CMD_FINISHED && b[1] == (byte)0xff 
                    && b[2] == (byte)0xff && b[3] == (byte)0xff){
                return true;
            }
                return false;
        }
        return false;
    }
    
    public boolean receiveTouchCommand(byte[] b) throws Exception{
        b = new byte[8];
        if(in.available() > 0){
            in.read(b);
            if(b[0] == NEX_RET_EVENT_TOUCH_HEAD && b[4] == (byte)0xff 
                    && b[5] == (byte)0xff && b[6] == (byte)0xff){
                return true;
            }
                return false;
        }
        return false;
    }
        
}
