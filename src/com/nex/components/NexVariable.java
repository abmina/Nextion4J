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
public class NexVariable extends NexObject{
        
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexVariable(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the current variable value
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
     * used to set the variable value
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
     * gets the text written variable value
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
     * used to set the text in the variable value
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
}
