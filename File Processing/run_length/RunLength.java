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

    public void readFile(File file, int action, String filename) {
        if (!"".equals(file.getPath())) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file.getPath(), StandardCharsets.UTF_8));
                String aux, currentText = "";
                while ((aux = reader.readLine()) != null) {
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

    private String compress(char[] chArray) {
        int pos = 1;
        if (chArray.length > 0) {
            while (pos < chArray.length && chArray[0] == chArray[pos]) {
                pos++;
            }
            result += pos;
            result += chArray[0];
            compress(Arrays.copyOfRange(chArray, pos, chArray.length));
        }
        return result;
    }

    private String decompress(char[] chArray) {
        int num = 0;
        int letter = 1;
        if (chArray.length > 0) {
            result += String.valueOf(chArray[letter]).repeat(Integer.parseInt(String.valueOf(chArray[num])));;
            decompress(Arrays.copyOfRange(chArray, letter + 1, chArray.length));
        }
        return result;
    }

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
