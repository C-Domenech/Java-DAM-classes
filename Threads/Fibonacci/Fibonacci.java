package com.cdomenech.threads;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Fibonacci extends Thread {

    private int n;
    public int fibN, fibN_1;

    public Fibonacci(int num) {
        this.n = num;
    }

    public void run() {
        if (n == 0) {
            fibN = 0;
            fibN_1 = 0;
        } else if (n <= 2) {
            fibN = 1;
            fibN_1 = 1;
        } else {
            Fibonacci h = new Fibonacci(n - 1);
            h.start();
            while (h.isAlive());
            fibN_1 = h.fibn();
            fibN = h.fibn() + h.fibn_1();
            //System.out.println("El número de la sucesión de Fibonacci en la posición " + n + " es el " + fibN);
        }
    }

    public int fibn() {
        return fibN;
    }

    public int fibn_1() {
        return fibN_1;
    }

}
