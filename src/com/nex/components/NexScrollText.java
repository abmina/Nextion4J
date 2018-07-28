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
public class NexScrollText extends NexTouch {
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexScrollText(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the text written inside the Scroll text box
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
     * used to set the text inside the Scroll text box
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
     * used to get the scroll direction
     * 
     * @return the "dir" attribute direction integer value:
     * 0-Left to Right
     * 1-Right to Left
     * 2-Up
     * 3-Down
     * @throws Exception 
     */
    public int getScrollDirection() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".ycen";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the scroll direction of the scroll box
     * 
     * @param dir use the below to set attribute "dir" to:  
     * 0-Left to Right
     * 1-Right to Left
     * 2-Up
     * 3-Down
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setScrollDirection(int dir) throws Exception{
        String cmd;
        cmd = getObjName() + ".ycen=" + dir;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current scroll distance
     * 
     * @return the "dis" attribute of the scroll box
     * @throws Exception 
     */
    public int getScrollDistance() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".dis";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the scroll distance of the scroll box
     * minimum is 2
     * maximum is 50
     * 
     * @param value passed to the function to set the "dis" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setScrollDistance(int value) throws Exception{
        String cmd;
        if(value < 2){
            value = 2;
        }
        if(value > 50){
            value = 50;
        }
        cmd = getObjName() + ".dis=" + value;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * gets the current scroll time interval
     * 
     * @return the "tim" attribute of the scroll box
     * @throws Exception 
     */
    public int getCycleTime() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".tim";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set the scroll time interval of the scroll box
     * minimum is 80
     * maximum is 65535
     * 
     * @param value passed to the function to set the "tim" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setCycleTime(int value) throws Exception{
        String cmd;
        if(value < 80){
            value = 80;
        }
        cmd = getObjName() + ".tim=" + value;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * enables the scrolling function of the scroll textbox
     * 
     * @return true if the command was successfully completed
     * @throws Exception 
     */
    public boolean enable() throws Exception{
        String cmd;
        cmd = getObjName() + ".en=1";
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * disables the scrolling function of the scroll textbox
     * 
     * @return true if the command was successfully completed
     * @throws Exception 
     */
    public boolean disable() throws Exception{
        String cmd;
        cmd = getObjName() + ".en=0";
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
