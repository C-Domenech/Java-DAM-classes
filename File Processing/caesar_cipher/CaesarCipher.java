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
package com.cdomenech.caesar_cipher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class CaesarCipher {

    /**
     * Read every line of the selected file and send it to the encrypt or
     * decrypt method
     *
     * @param file File selected by the user
     * @param shift Number which shift is going to have the encryption or decryption
     * @param action Number that select if we are going to encrypt or decrypt 0 -> encrypt, 1 -> decrypt
     * @param filename Name for the result file given by the user
     */
    public void readFile(File file, int shift, int action, String filename) {

        // Check if there is a selected path
        if (!"".equals(file.getPath())) {
            BufferedReader reader;
            try {
                // Create BufferedReader
                reader = new BufferedReader(new FileReader(file.getPath(), StandardCharsets.UTF_8));
                // Initialice final text and auxiliar variables
                String aux, currentText = "";
                // Check if there is a line to read
                while ((aux = reader.readLine()) != null) {
                    // action variable depends on the radio button selected by the user
                    if (action == 0) {
                        // Send every line to be encrypted
                        aux = encrypt(aux, shift);
                    } else if (action == 1) {
                        // Send every line to be decrypted
                        aux = decrypt(aux, shift);
                    }
                    /*
                     * Add every encrypted or decrypted line to the final text
                     * that will be written in the new file
                     */
                    currentText += aux + "\n";
                }
                // It is essential to close the BufferedReader
                reader.close();
                /*
                 * Send the final text, the directory where the original file
                 * was, and the filename given by the user
                 */
                saveNewFile(currentText, file.getParent(), filename);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * Encrypt every line sent by readFile method
     * 
     * @param message Every line of the text
     * @param shift shift number to encrypt
     * @return String result is the line encrypted
     */
    public String encrypt(String message, int shift) {
        String result = "";
        message = message.toUpperCase();
        // Convert String into a char array
        for (char ch : message.toCharArray()) {
            
            // Check if it is a letter
            if (Character.isLetter(ch)) {
                int pos = ch;

                // Replace the original char by another, depending on the selected shift
                for (int i = 0; i < shift; i++) {
                    if (pos == 65) { // Check if we are not out of the ASCII letters range
                        pos = 91; // Correct position if it is necessary
                    }
                    pos -= 1;
                }
                result += (char) pos; // After the change, add new char to the result
            } else {

                result += ch; // If it is not a letter, add the original
            }
        }
        // Return the encrypted String to the readFile method
        return result;
    }
    
    /**
     * Revert what the encrypt method has done
     * @param message Every line of the text
     * @param shift shift number to decrypt
     * @return String result is the line decrypted
     */
    public String decrypt(String message, int shift) {
        String result = "";
        message = message.toUpperCase();
        // Convert String into a char array
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                int pos = ch;
                for (int i = 0; i < shift; i++) {
                    if (pos == 90) {
                        pos = 64;
                    }
                    pos += 1;
                }
                result += (char) pos;
            } else {
                result += ch;
            }
        }
        return result;
    }
    /**
     * Save the text into a new file which name has been given by the user
     * It will be save in the same directory as the original file
     * 
     * @param text The whole text
     * @param parentPath Directory path of the file selected by the user
     * @param filename Filename given by the user
     */
    public void saveNewFile(String text, String parentPath, String filename) {
        try {
            File file = new File(parentPath + "/" + filename + ".txt");
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8));
            // Write the created file with the result of the encrypting or decrypting method
            writer.write(text);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
