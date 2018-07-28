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
public class NexTimer extends NexObject {
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexTimer(int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * gets the current timer cycle time
     * 
     * @return the "tim" attribute of the timer
     * @throws Exception 
     */
    public int getCycleTime() throws Exception{
        String cmd;
        cmd = "get " + getObjName() + ".tim";
        nex.sendCommand(cmd);
        return nex.receiveInt();
    }
    
    /**
     * used to set new timer cycle time
     * 
     * @param value passed to the function to set the "tim" attribute
     * @return true if the command was finished successfully.
     * @throws Exception 
     */
    public boolean setValue(int value) throws Exception{
        String cmd;
        if(value < 50){
            value = 50;
        }
        cmd = getObjName() + ".tim=" + value;
        nex.sendCommand(cmd);
        
        cmd = "ref " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
    
    /**
     * enables the timer
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
     * disables the timer
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
