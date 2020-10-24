package com.cdomenech.threads;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Escritora extends Thread {

    private int times;
    private char ch;

    public Escritora(int times, char ch) {
        this.times = times;
        this.ch = ch;

    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(ch);
        }

    }

}
