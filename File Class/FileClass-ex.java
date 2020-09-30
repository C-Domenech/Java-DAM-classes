
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-Domenech
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Realizar un listado del contenido de una carpeta que se pase por 
        // línea de comandos, mostrando el tipo de archivo y el tamaño en formato "humano"

	// Similar to "dir" command in Windows

        
        File all_files = new File(args[0]); // Right click on the project > Properties > Run > Arguments -> C:\Windows (Any directory)
        File paths[] = all_files.listFiles(); //
        //String[] symbolSizeArr;
        for (File path : paths) {
            long size = getSize(path);
            String[] symbolSizeArr = getSymbolSize(size);
            
            // String.format
            if (path.isDirectory()) {
                System.out.format("[D] %-30.30s  %-5s%s%n",path.getName(), symbolSizeArr[0], symbolSizeArr[1]);
                //System.out.println("[D]" + path.getName() + symbolSizeArr[0] + symbolSizeArr[1]);
            } else if (path.isFile()) {
                //System.out.println("[ ]" + path.getName() + symbolSizeArr[0] + symbolSizeArr[1]);
                System.out.format("[ ] %-30.30s  %-5s%s%n",path.getName(), symbolSizeArr[0], symbolSizeArr[1]);
            }   
        }
    }
    
    public static long getSize(File path) {
        long size = 0;
        if (path.isDirectory()) {
            for (File file : path.listFiles()) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += getSize(file);
                }
            }
        } else if (path.isFile()) {
            size += path.length();
        }
        
        return size;
    }
	
    public static String[] getSymbolSize(long size) {
        String symbol = "";
        long finalSize = 0;
        if (size < 1024) {
            symbol = "bytes";
            finalSize = size;
        } else if (size >= 1024 && size < 1048576 ) {
            symbol = "Kb";
            finalSize = size / 1024;
        } else if (size >= 1048576 && size < 1073741824) {
            symbol = "Mb";
            finalSize = size / 1048576;
            
        } else if (size >= 1073741824L && size < 1099511627776L) {
            symbol = "Gb";
            finalSize = size / 1073741824;
        }
        String sizeStr = String.valueOf(finalSize);
        String[] symbolSize = {sizeStr, symbol};
        return symbolSize;
    }
    
}
