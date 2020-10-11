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

    public void readFile(File file, int shift, int action, String filename) {
        if (!"".equals(file.getPath())) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file.getPath(), StandardCharsets.UTF_8));
                String aux, currentText = "";
                while ((aux = reader.readLine()) != null) {
                    if (action == 0) {
                        aux = encrypt(aux, shift);
                    } else if (action == 1) {
                        aux = decrypt(aux, shift);
                    }
                    currentText += aux + "\n";
                }
                reader.close();
                saveNewFile(currentText, file.getParent(), filename);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String encrypt(String message, int shift) {
        String result = "";
        message = message.toUpperCase();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                int pos = ch;
                for (int i = 0; i < shift; i++) {
                    if (pos == 65) {
                        pos = 91;
                    }
                    pos -= 1;
                }
                result += (char) pos;
            } else {
                result += ch;
            }
        }
        return result;
    }

    public String decrypt(String message, int shift) {
        String result = "";
        message = message.toUpperCase();
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

    public void saveNewFile(String text, String parentPath, String filename) {
        try {
            File file = new File(parentPath + "/" + filename + ".txt");
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8));
            writer.write(text);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(CaesarCipher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
