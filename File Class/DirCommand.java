
import java.io.File;

/**
 *
 * @author Cristina Domenech <github.com/C-Domenech>
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
        // Get argument from the command line
        File all_files = new File(args[0]); // "C:\Users\AlumnoManana20-21\Downloads" o "D:\Downloads"
        File paths[] = all_files.listFiles();
        for (File path : paths) {
            long size = getSize(path);
            String[] unitSizeArr = getUnitSize(size);
            
            // Print formatted results
            if (path.isDirectory()) {
                System.out.format("[D] %-30.30s  %-5s%s%n",path.getName(), unitSizeArr[0], unitSizeArr[1]);
            } else if (path.isFile()) {
                System.out.format("[ ] %-30.30s  %-5s%s%n",path.getName(), unitSizeArr[0], unitSizeArr[1]);
            }   
        }

    }
    
    // Get files size (bytes)
    public static long getSize(File path) {
        long size = 0;
        // If it is a directory, get size of all files that are inside
        if (path.isDirectory()) {
            for (File file : path.listFiles()) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    // Recursive function -> If it is a directory, the function call itself
                    size += getSize(file);
                }
            }
        } else if (path.isFile()) {
            size += path.length();
        }
        
        return size;
    }
    
    // Get unit depending on file size
    public static String[] getUnitSize(long size) {
        String unit = "";
        long finalSize = 0;
        if (size < 1024) {
            unit = "bytes";
            finalSize = size;
        } else if (size >= 1024 && size < 1048576 ) {
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
        // getUnitSize return a String array
        return unitSize;
    }
    
}
