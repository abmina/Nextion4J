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
package com.nex.screen;


import com.fazecast.jSerialComm.SerialPort;
import com.nex.components.*;
import com.nex.config.NexHardware;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public class NexScreen {
    
    /*
     * creating a String object that holds the serial communication port
     * designation
     */
    private SerialPort commPort;
    private final NexHardware hardware = NexHardware.getInstance();
    public List<NexTouch> touchComponents = new ArrayList<>();
    public List<NexObject> components = new ArrayList<>();
    
    /**
     * Default constructor
     */
    public NexScreen(){
        
    }
    
    /**
     * Screen constructor with SerialPort object as parameter
     * @param serial is of type SerialPort
     */
    public NexScreen(SerialPort serial){
        commPort = serial;
        hardware.setCommPort(commPort);
    }
    
    public void setCommPort(SerialPort serial){
        commPort = serial;
        hardware.setCommPort(commPort);
    }
    
    /**
     * Creates a NexButton Object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen
     */
    public void addButton(int pid, int cid, String name){
        NexButton button = new NexButton(pid, cid, name);
        touchComponents.add(button);
    }
    
    /**
     * Creates a NexCheckbox object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addCheckBox(int pid, int cid, String name){
        NexCheckbox check = new NexCheckbox(pid, cid, name);
        touchComponents.add(check);
    }
    
    /**
     * Creates a NexCrop object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addCrop(int pid, int cid, String name){
        NexCrop crop = new NexCrop(pid, cid, name);
        touchComponents.add(crop);
    }
    
    /**
     * Creates a NexDualStateButton object and adds it to the screen components
     * @param pid
     * @param cid
     * @param name 
     */
    public void addDualStateButton(int pid, int cid, String name){
        NexDualStateButton button = new NexDualStateButton(pid, cid, name);
        touchComponents.add(button);
    }
    
    /**
     * Creates a NexGuage object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addGauge(int pid, int cid, String name){
        NexGauge gauge = new NexGauge(pid, cid, name);
        touchComponents.add(gauge);
        
    }
    
    /**
     * Creates a NexHotspot object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addHotspot(int pid, int cid, String name){
        NexHotspot spot = new NexHotspot(pid, cid, name);
        touchComponents.add(spot);
    }
    
    /**
     * Creates a NexNumber object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addNumber(int pid, int cid, String name){
        NexNumber num = new NexNumber(pid, cid, name);
        touchComponents.add(num);
    }
    
    /**
     * Creates a NexPage object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addPage(int pid, int cid, String name){
        NexPage page = new NexPage(pid, cid, name);
        touchComponents.add(page);
    }
    
    /**
     * Creates a NexPicture object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addPicture(int pid, int cid, String name){
        NexPicture pic = new NexPicture(pid, cid, name);
        touchComponents.add(pic);
    }
    
    /**
     * Creates a NexProgressBar object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addProgressBar(int pid, int cid, String name){
        NexProgressBar bar = new NexProgressBar(pid, cid, name);
        components.add(bar);
    }
    
    /**
     * Creates a NexRadio object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addRadio(int pid, int cid, String name){
        NexRadio rad = new NexRadio(pid, cid, name);
        touchComponents.add(rad);
    }
    
    /**
     * Creates a NexScrollText object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addScrollText(int pid, int cid, String name){
        NexScrollText txt = new NexScrollText(pid, cid, name);
        touchComponents.add(txt);
    }
    
    /**
     * Creates a NexSlider object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addSlider(int pid, int cid, String name){
        NexSlider slide = new NexSlider(pid, cid, name);
        touchComponents.add(slide);
    }
    
    /**
     * Creates a NexText object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addText(int pid, int cid, String name){
        NexText txt = new NexText(pid, cid, name);
        touchComponents.add(txt);
    }
    
    /**
     * Creates a NexTimer object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addTimer(int pid, int cid, String name){
        NexTimer time = new NexTimer(pid, cid, name);
        components.add(time);
    }
    
    /**
     * Creates a NexVariable object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addVariable(int pid, int cid, String name){
        NexVariable var = new NexVariable(pid, cid, name);
        components.add(var);
    }
    
    /**
     * Creates a NexWaveform object and adds it to the screen components
     * @param pid page ID on the screen
     * @param cid component ID on the screen
     * @param name component name on the screen 
     */
    public void addWaveform(int pid, int cid, String name){
        NexWaveform wave = new NexWaveform(pid, cid, name);
        touchComponents.add(wave);
    }
    
    /**
     * updates the touch events components of the screen that were added to the component
     * list
     * @throws Exception
     */
    public void update() throws Exception{
        for(int i = 0; i < touchComponents.size(); i++){
            touchComponents.get(i).updateTouch();
        }
    }
}
