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
package com.cdomenech.run_length;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class RunLength {

    String result = "";

    /**
     * Read every line of the selected file and send it to the compress or
     * decompress method
     *
     * @param file     File selected by the user
     * @param action   Number that select if we are going to compress or decompress
     *                 0 -> compress, 1 -> decompress
     * @param filename Name for the result file given by the user
     */
    // Read every line of the selected file
    public void readFile(File file, int action, String filename) {
        // Check if there is a path
        if (!"".equals(file.getPath())) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file.getPath(), StandardCharsets.UTF_8));
                String aux, currentText = "";
                while ((aux = reader.readLine()) != null) {
                    // Convert every line into a char array
                    char[] chArray = aux.toCharArray();
                    if (action == 0) {
                        aux = compress(chArray);
                        result = "";
                    } else if (action == 1) {
                        aux = decompress(chArray);
                        result = "";
                    }
                    currentText += aux + "\n";
                }
                reader.close();
                saveNewFile(currentText, file.getParent(), filename);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RunLength.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RunLength.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Recursive function that compress the line: first number, then letter
     *
     * @param chArray A line converted into a char Array
     * @return A compressed line
     */
    private String compress(char[] chArray) {
        int pos = 1;
        // Check that there are elements in chArray
        if (chArray.length > 0) {
            // While the position is smaller than the chArray length (it is not out of
            // range)
            // And the element in the first position (position 0) is equal than the next
            // element (position 1)
            while (pos < chArray.length && chArray[0] == chArray[pos]) {
                // Counter -> number of elements that are equal
                pos++;
            }
            // Add number of elements that are equal
            result += pos;
            // Add the element
            result += chArray[0];
            // Arrays.copyOfRange -> reduce the array from pos position until the end
            // Call method itselft but sending only the part of chArray that has not been
            // checked
            compress(Arrays.copyOfRange(chArray, pos, chArray.length));
        }
        return result;
    }

    /**
     * Recursive function that decompress the line: add letter a number of times
     * 
     * @param chArray A line converted into a char Array
     * @return A decompressed line
     */
    private String decompress(char[] chArray) {
        int num = 0;
        int letter = 1;
        if (chArray.length > 0) {
            // Add the element in second position (letter -> 1) and repeat it the number of
            // times that shows the first position (num -> 0)
            result += String.valueOf(chArray[letter]).repeat(Integer.parseInt(String.valueOf(chArray[num])));
            // Arrays.copyOfRange -> reduce the array from pos position until the end
            // Call method itselft but sending only the part of chArray that has not been
            // added to the result
            decompress(Arrays.copyOfRange(chArray, letter + 1, chArray.length));
        }
        return result;
    }

    /**
     * Save the text into a new file which name has been given by the user It will
     * be save in the same directory as the original file
     *
     * @param text       The whole text
     * @param parentPath Directory path of the file selected by the user
     * @param filename   Filename given by the user
     */
    private void saveNewFile(String text, String parentPath, String filename) {
        try {
            File file = new File(parentPath + "/" + filename + ".txt");
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8));
            writer.write(text);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(RunLength.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
