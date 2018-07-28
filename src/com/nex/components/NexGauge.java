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
public class NexGauge extends NexTouch{
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexGauge(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the current angle of the gauge needle
     * 
     * @return the "val" attribute of the Gauge
     * @throws Exception 
     */
    public int getValue() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".val";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the angle of the gauge needle
     * 
     * @param value passed to the function to set the "val" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setValue(int value) throws Exception{
        String cmd;
        cmd = getObjName() + ".val=" + value;
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
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
     * used to get the pointer color of the gauge
     * 
     * @return true if the command was completed successfully
     * @throws Exception 
     */
    public int getPointerColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pco";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set pointer color of the component
     * 
     * @param color is the color integer value to change the "pco" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPointerColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".pco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current angle of the gauge needle
     * 
     * @return the "wid" attribute of the Gauge
     * @throws Exception 
     */
    public int getPointerThickness() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".wid";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the current state of the button
     * 
     * @param number passed to the function to set the "wid" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPointerThickness(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".wid=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the crop pic component
     * 
     * @return the "picc" attribute ID value
     * @throws Exception 
     */
    public int getCropPic() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".picc";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set pic ID of the crop pic component
     * 
     * @param number is the ID value to change the "picc" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setCropPic(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".picc=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
