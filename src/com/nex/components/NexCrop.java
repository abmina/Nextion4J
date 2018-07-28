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
public class NexCrop extends NexTouch {
    
    /**
     * NexCrop constructor with:
     * @param pid page ID
     * @param cid component ID
     * @param name component name
     */
    public NexCrop(int pid, int cid, String name){
        super(pid, cid, name);
        
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
