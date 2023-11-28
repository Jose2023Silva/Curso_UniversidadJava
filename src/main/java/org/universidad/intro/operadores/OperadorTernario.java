package org.universidad.intro.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadorTernario {
    public static void main(String[] args) {
        // OPERADOR TERNARIO
        
        var res = (3 > 2) ? "Verdadero":"Falso";
        System.out.println("res = " + res);
        
        var res2 = (3 > 2) ? 56 : 23;
        System.out.println("res2 = " + res2);
        
    }
}
