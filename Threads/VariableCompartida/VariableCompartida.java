package com.cdomenech.threads;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class VariableCompartida {

    private int v;

    public VariableCompartida(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void inc() {
        v++;
    }

}
