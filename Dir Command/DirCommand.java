package com.cdomenech.dir_command;

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
import java.io.File;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */

/*
TODO
Realizar un listado del contenido de una carpeta que se pase por línea de 
comandos, mostrando el tipo de archivo y el tamaño en formato "humano"
mostrando la unidad (Kb, Mb, Gb,...) adecuada.
 */
public class DirCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File all_files = new File(args[0]); // "C:\Users\AlumnoManana20-21\Downloads" o "D:\Downloads"
        File paths[] = all_files.listFiles();
        for (File path : paths) {
            /**
             * Get size, unit and final size from the functions
             */
            long size = getSize(path);
            String[] unitSizeArr = getUnitSize(size);
            /**
             * Print formatted results
             */
            if (path.isDirectory()) {
                System.out.format("[D] %-30.30s  %-5s%s%n", path.getName(), unitSizeArr[0], unitSizeArr[1]);
            } else if (path.isFile()) {
                System.out.format("[ ] %-30.30s  %-5s%s%n", path.getName(), unitSizeArr[0], unitSizeArr[1]);
            }
        }

    }

    /**
     * A recursive function that call itself to get all files and directories
     * size in bytes
     *
     * @param path
     *
     * @return long size of directories and files
     *
     */
    public static long getSize(File path) {
        long size = 0;
        if (path.isDirectory()) {
            for (File file : path.listFiles()) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    /**
                     * Recursive function -> If it is a directory, the function
                     * call itself
                     */
                    size += getSize(file);
                }
            }
        } else if (path.isFile()) {
            size += path.length();
        }

        return size;
    }

    /**
     *
     * @param size
     *
     * @return String Array with two elements: final size and unit (bytes, Kb,
     * Mb, Gb)
     *
     */
    public static String[] getUnitSize(long size) {
        String unit = "";
        long finalSize = 0;
        if (size < 1024) {
            unit = "bytes";
            finalSize = size;
        } else if (size >= 1024 && size < 1048576) {
            unit = "Kb";
            finalSize = size / 1024;
        } else if (size >= 1048576 && size < 1073741824) {
            unit = "Mb";
            finalSize = size / 1048576;

        } else if (size >= 1073741824L && size < 1099511627776L) {
            unit = "Gb";
            finalSize = size / 1073741824;
        }
        String sizeStr = String.valueOf(finalSize);
        String[] unitSize = {sizeStr, unit};

        return unitSize;
    }

}
