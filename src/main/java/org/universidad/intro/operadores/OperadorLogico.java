package org.universidad.intro.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadorLogico {
    public static void main(String[] args) {
        // OPERADORES LOGICOS
        
        int a = 45, b = 46;
        
        // AND
        var c = a > b && a <56;
        System.out.println("c = " + c);
        
        // OR
        var d = a > b || a <56;
        System.out.println("d = " + d);
        
        // Not
        var e = !d;
        System.out.println("e = " + e);
    }
}
