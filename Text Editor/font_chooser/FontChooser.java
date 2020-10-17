/*
 * Copyright (C) 2020 Cristina Domenech <linkedin.com/in/c-domenech/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cdomenech.font_chooser;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class FontChooser {
    // List of all the fonts in the system
    private final String[] fontList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    // Default font, style and size
    private String font = "Tahoma";
    private int style = 0;
    private int size = 11;

    public FontChooser(String font, int style, int size) {
        this.font = font;
        this.style = style;
        this.size = size;
    }

    public String[] getFontList() {
        return fontList;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }
    
    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    } 
    /**
     * Method that convert a style font from String to int
     * 
     * @param rawStyle Font choosed by the user
     * @return style is the font converted into an int that the Font class can read
     */
    public int getSelectedStyle(String rawStyle) {
        switch (rawStyle) {
            case "Plain":
                style = Font.PLAIN;
                break;
            case "Bold":
                style = Font.BOLD;
                break;
            case "Italic":
                style = Font.ITALIC;
                break;
            default:
                break;
        }

        return style;
    }
    
}
