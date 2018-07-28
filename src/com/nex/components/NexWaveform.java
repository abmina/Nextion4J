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
package com.nex.components;

/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public class NexWaveform extends NexTouch{
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexWaveform(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * adds a value to the specified chanel in the waveform
     * 
     * @param value is the value required to be added to the waveform
     * @param channel is the waveform channel as follows
     * 0-channel 1
     * 1-channel 2
     * 2-channel 3
     * 3-channel 4
     * @return true when the command is completed successfully
     * @throws Exception 
     */
    public boolean addValue(int value, int channel) throws Exception{
        String cmd;
        if(channel > 3){
            return false;
        }
        cmd = "add " + getObjCid() + "," + channel + "," + value ;
        nex.sendCommand(cmd);
        return true;
    }
    
    /**
     * used to get the background color of the component
     * 
     * @return the "bco" attribute integer value
     * @throws Exception 
     */
    public int getBackgroundColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".bco";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set background color of the component
     * 
     * @param color is the color integer value to change the "bco" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setBackgroundColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".bco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the grid color of the component
     * 
     * @return the "gco" attribute integer value
     * @throws Exception 
     */
    public int getGridColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".gco";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set gco color of the component
     * 
     * @param color is the color integer value to change the "gco" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setGridColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".gco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }   
}
