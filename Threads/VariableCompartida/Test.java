package com.cdomenech.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Test {

    /*
    TODO
    Disponemos de una clase denominada VariableCompartida que encapsula el valor 
    de una variable v  de  tipo  int.  La  clase  VariableCompartidacontiene métodos 
    para establecer (método set), obtener (método get) o incrementar (método inc) 
    el valor de v. Realizar un programa  en  Java  que  cree  2  hebras  compartiendo  
    una instancia  de  la  clase  VariableCompartida e incrementen cada una de 
    ella 10 veces el valor de v. Mostrar desde la hebra del  programa  principal  
    el  valor  final  de  v.  ¿Se obtienen los resultados esperados? 
    Aumenta progresivamente el número de incrementos hasta observar  
    algún comportamiento "extraño". 
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VariableCompartida vc = new VariableCompartida(0);

        Hebra h1 = new Hebra(vc);
        Hebra h2 = new Hebra(vc);

        h1.start();
        System.out.println("Empieza Hebra 1");
        h2.start();
        System.out.println("Empieza Hebra 2");

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");
        System.out.println("Valor de V: " + vc.getV());

    }

}
