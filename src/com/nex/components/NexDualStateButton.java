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
public class NexDualStateButton extends NexTouch {
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexDualStateButton(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the current state of the button
     * 
     * @return the "val" attribute of the DualStateButton
     * @throws Exception 
     */
    public int getValue() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".val";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the current state of the button
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
     * gets the text written inside the button
     * 
     * @return the "txt" attribute of the button
     * @throws Exception 
     */
    public String getText() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".txt";
        nex.sendCommand(cmd);
        return nex.receiveText();
    }
    
    /**
     * used to set the text inside the button
     * 
     * @param txt passed to the function to set the "txt" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setText(String txt) throws Exception{
        String cmd;
        cmd = getObjName() + ".txt=\"" + txt + "\"";
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the state0 color of the component
     * 
     * @return the "bco0" attribute integer value
     * @throws Exception 
     */
    public int getState0Color() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".bco0";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set state0 color of the component
     * 
     * @param color is the color integer value to change the "bco0" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState0Color(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".bco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the state1 color of the component
     * 
     * @return the "bco1" attribute integer value
     * @throws Exception 
     */
    public int getState1Color() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".bco1";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set state1 color of the component
     * 
     * @param color is the color integer value to change the "bco1" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState1Color(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".bco1=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the font color of the component
     * 
     * @return the "pco" attribute color integer value
     * @throws Exception 
     */
    public int getFontColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pco";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set font color of the component
     * 
     * @param color is the color integer value to change the "pco" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setFontColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".pco=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the font color of the component when pressed
     * 
     * @return the "pco2" attribute color integer value
     * @throws Exception 
     */
    public int getPressFontColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pco2";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set font color of the component when pressed
     * 
     * @param color is the color integer value to change the "pco2" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPressFontColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".pco2=" + color;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the font horizontal orientation in the component
     * 
     * @return the "xcen" attribute color integer value:
     * 0-Left
     * 1-Center
     * 2-Right
     * @throws Exception 
     */
    public int getFontHorizontalLoc() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".xcen";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the font horizontal orientation in the component
     * 
     * @param loc use the below to set attribute "xcen" to:  
     * 0-Left
     * 1-Center
     * 2-Right
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setFontHorizontalLoc(int loc) throws Exception{
        String cmd;
        cmd = getObjName() + ".xcen=" + loc;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the font vertical orientation
     * 
     * @return the "ycen" attribute color integer value:
     * 0-Up
     * 1-Center
     * 2-Down
     * @throws Exception 
     */
    public int getFontVerticalLoc() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".ycen";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the font vertical orientation in the component
     * 
     * @param loc use the below to set attribute "xcen" to:  
     * 0-Up
     * 1-Center
     * 2-Down
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setFontVerticalLoc(int loc) throws Exception{
        String cmd;
        cmd = getObjName() + ".ycen=" + loc;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the font ID of the component
     * 
     * @return the "font" attribute ID value
     * @throws Exception 
     */
    public int getFont() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".font";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set font ID of the component
     * 
     * @param fontID is the ID value to change the "font" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setFont(int fontID) throws Exception{
        String cmd;
        cmd = getObjName() + ".font=" + fontID;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the crop pic component of state 0
     * 
     * @return the "picc0" attribute ID value
     * @throws Exception 
     */
    public int getState0CropPic() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".picc0";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set pic ID of the crop pic component of state 0
     * 
     * @param number is the ID value to change the "picc0" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState0CropPic(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".picc=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the crop pic component of state 1
     * 
     * @return the "picc1" attribute ID value
     * @throws Exception 
     */
    public int getState1CropPic() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".picc1";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set pic ID of the crop pic component of state 1
     * 
     * @param number is the ID value to change the "picc1" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState1CropPic(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".picc1=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the picture component of state 0
     * 
     * @return the "pic0" attribute ID value
     * @throws Exception 
     */
    public int getState0Image() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pic0";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
     /**
     * used to set pic ID of the picture component of state 0
     * 
     * @param number is the ID value to change the "pic0" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState0Image(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".pic=0" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the picture component of state 1
     * 
     * @return the "pic1" attribute ID value
     * @throws Exception 
     */
    public int getState1Image() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pic1";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
     /**
     * used to set pic ID of the picture component of state 1
     * 
     * @param number is the ID value to change the "pic1" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setState1Image(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".pic1=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
