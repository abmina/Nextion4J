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
package com.nex.config;

/**
 *
 * @author Abdallah Mina <abdallahmina2@hotmail.com>
 */
public interface Constants {
    
    public final byte NEX_RET_CMD_FINISHED = (byte)0x01;
    public final byte NEX_RET_EVENT_LAUNCHED = (byte)0x88;
    public final byte NEX_RET_EVENT_UPGRADED = (byte)0x89;
    public final byte NEX_RET_EVENT_TOUCH_HEAD = (byte)0x65;     
    public final byte NEX_RET_EVENT_POSITION_HEAD = (byte)0x67;
    public final byte NEX_RET_EVENT_SLEEP_POSITION_HEAD = (byte)0x68;
    public final byte NEX_RET_CURRENT_PAGE_ID_HEAD = (byte)0x66;
    public final byte NEX_RET_STRING_HEAD = (byte)0x70;
    public final byte NEX_RET_NUMBER_HEAD = (byte)0x71;
    public final byte NEX_RET_INVALID_CMD = (byte)0x00;
    public final byte NEX_RET_INVALID_COMPONENT_ID = (byte)0x02;
    public final byte NEX_RET_INVALID_PAGE_ID = (byte)0x03;
    public final byte NEX_RET_INVALID_PICTURE_ID = (byte)0x04;
    public final byte NEX_RET_INVALID_FONT_ID = (byte)0x05;
    public final byte NEX_RET_INVALID_BAUD = (byte)0x11;
    public final byte NEX_RET_INVALID_VARIABLE = (byte)0x1A;
    public final byte NEX_RET_INVALID_OPERATION = (byte)0x1B;
    public final byte NEX_END_BYTE = (byte)0xFF;
    
    public final byte NEX_TOUCH = (byte)0x01;
    public final byte NEX_RELEASE = (byte)0x00;
    
}
