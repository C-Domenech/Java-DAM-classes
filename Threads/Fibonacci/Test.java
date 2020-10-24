package com.cdomenech.threads;

/*
TODO 
Implementar  un  programa  en  Java  que  permita  calcular términos de la sucesión 
de Fibonacci. Se dispondrá de N hebras para calcular hasta el término N-ésimode  
dicha sucesión, de forma que la hebra con identificador i-ésimo debe calcular el 
término i-ésimo utilizando los valores de las hebras i-1 e i-2. Implementar una 
solución basada en espera  activa.  Las  hebras  deben  esperar  a  que  estén 
calculados los términos anteriores al suyo. Considerar los términos 0 y 1 como 
casos especiales.
 */
/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos = 7;
        Fibonacci f = new Fibonacci(pos);
        f.start();
        while (f.isAlive());
        System.out.println("El número de la sucesión de Fibonacci en la posición " + pos + " es el " + f.fibn());
    }

}
