package com.cdomenech.threads;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Main {

    /*
    TODO: Realizar un programa en Java con 3 hebras, cada una de las cuales 
    escribe por pantalla varias veces (valor pasado como parámetro en el constructor) 
    el carácter que se le indique (también indicado como parámetro). 
    ¿Se mezclan las letras?
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Escritora w1 = new Escritora(10, 'A');
        Escritora w2 = new Escritora(10, 'B');
        Escritora w3 = new Escritora(10, 'C');

        System.out.println("Empieza A");
        w1.start();
        System.out.println("Empieza B");
        w2.start();
        System.out.println("Empieza C");
        w3.start();

    }

}
