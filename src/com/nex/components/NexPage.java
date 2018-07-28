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
public class NexPage extends NexTouch {
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexPage (int pid, int cid, String name){
        super(pid, cid, name);
    }
    
    /**
     * used to show the page on the screen
     * 
     * @return true if the command was completed successfully
     * @throws Exception 
     */    
    public boolean showPage() throws Exception{
        String cmd;
        cmd = "page " + getObjName();
        nex.sendCommand(cmd);
        return nex.receivedFinishedCommand();
    }
}
