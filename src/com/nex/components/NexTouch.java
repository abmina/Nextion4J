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

import com.nex.config.Constants;

/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */

public class NexTouch extends NexObject implements Constants{
    
    public boolean touched;
    public boolean released;
    
    /**
     * 
     * @param pid
     * @param cid
     * @param name 
     */
    public NexTouch(int pid, int cid, String name){
        super(pid, cid, name);
        
    }
    
    /**
     * returns the status of the touch event
     * 
     * @return 
     */
    public boolean isTouched(){
        return touched;
    }
    
    /**
     * 
     * @return the status of the touch release event
     */
    public boolean isReleased(){
        return released;
    }
    
    /**
     * Checks the screen for touch event updates
     * 
     * @throws Exception 
     */
    public void updateTouch() throws Exception{
        byte[] b = new byte[8];
        if(nex.receiveTouchCommand(b)){
            if(b[1] == getObjPid() && b[2] == getObjCid() 
                    && b[3] == NEX_TOUCH){
                touched = true;
                released = false;
            }
            else if(b[1] == getObjPid() && b[2] == getObjCid() 
                    && b[3] == NEX_RELEASE){
                touched = false;
                released = true;
            }   
        }
        else{
            touched = false;
            released = false;
        }
    }       
}
