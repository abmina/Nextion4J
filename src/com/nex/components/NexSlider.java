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
public class NexSlider extends NexTouch {
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexSlider(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the current location of the slider
     * 
     * @return the "val" attribute of the slider
     * @throws Exception 
     */
    public int getValue() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".val";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the location of the slider
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
     * used to get the cursor color of the component
     * 
     * @return the "pco" attribute color integer value
     * @throws Exception 
     */
    public int getCursorColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pco";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set font cursor of the component
     * 
     * @param color is the color integer value to change the "pco" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setCursorColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".pco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current cursor thickness
     * 
     * @return the "wid" attribute of the slider
     * @throws Exception 
     */
    public int getCursorThickness() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".wid";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the cursor thickness
     * 
     * @param number passed to the function to set the "wid" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setCursorThickness(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".wid=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current cursor thickness
     * 
     * @return the "hig" attribute of the slider
     * @throws Exception 
     */
    public int getCursorHeight() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".hig";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the cursor thickness
     * 
     * @param number passed to the function to set the "hig" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setCursorHeight(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".hig=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current maximum value of the slider
     * 
     * @return the "maxval" attribute of the slider
     * @throws Exception 
     */
    public int getMaxValue() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".maxval";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the maximum value of the slider
     * 
     * @param number passed to the function to set the "maxval" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setMaxValue(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".maxval=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current minimum value of the slider
     * 
     * @return the "minval" attribute of the slider
     * @throws Exception 
     */
    public int getMinValue() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".maxval";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the minimum value of the slider
     * 
     * @param number passed to the function to set the "minval" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setMinValue(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".maxval=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
