package com.cdomenech.threads;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Hebra extends Thread {

    private VariableCompartida vc;

    public Hebra(VariableCompartida vc) {
        this.vc = vc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            vc.inc();
            //System.out.print(vc.getV() + " ");

        }
        //System.out.println(vc.getV());

    }

}
