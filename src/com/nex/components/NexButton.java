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
public class NexButton extends NexTouch {
    
    
    
    /**
     * NexButton constructor with:
     * @param pid page ID
     * @param cid component ID
     * @param name component name
     */
    public NexButton(int pid, int cid, String name){
        super(pid, cid, name);
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
     * used to get the background color of the component when pressed
     * 
     * @return the "bco2" attribute integer value
     * @throws Exception 
     */
    public int getPressBackgroundColor() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".bco2";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set background color of the component when pressed
     * 
     * @param color is the color integer value to change the "bco2" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPressBackgroundColor(int color) throws Exception{
        String cmd;
        cmd = getObjName() + ".bco2=" + color;
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
     * used to get the pic ID of the crop pic component
     * 
     * @return the "picc" attribute ID value
     * @throws Exception 
     */
    public int getBackgroundCropPic() throws Exception{
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
    public boolean setBackgroundCropPic(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".picc=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the crop pic component when pressed
     * 
     * @return the "picc2" attribute ID value
     * @throws Exception 
     */
    public int getPressBackgroundCropPic() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".picc2";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set pic ID of the crop pic component when pressed
     * 
     * @param number is the ID value to change the "picc2" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPressBackgroundCropPic(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".picc2=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the picture component
     * 
     * @return the "pic" attribute ID value
     * @throws Exception 
     */
    public int getBackgroundImage() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pic";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
     /**
     * used to set pic ID of the picture component
     * 
     * @param number is the ID value to change the "pic" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setBackgroundImage(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".pic=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * used to get the pic ID of the picture component when pressed
     * 
     * @return the "pic2" attribute ID value
     * @throws Exception 
     */
    public int getPressBackgroundImage() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".pic2";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
     /**
     * used to set pic ID of the picture component when pressed
     * 
     * @param number is the ID value to change the "pic2" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setPressBackgroundImage(int number) throws Exception{
        String cmd;
        cmd = getObjName() + ".pic2=" + number;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
