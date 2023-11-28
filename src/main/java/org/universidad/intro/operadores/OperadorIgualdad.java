package org.universidad.intro.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadorIgualdad {
    public static void main(String[] args) {
        /*
        OPERADORES DE IGUALDADES
        Cuando se usa, se retorna un valor booleano con dos posibles valores, true o false
        
        */
        int a = 45, b = 46;
        
        // igual
        var c = (a == b);
        System.out.println("c = " + c);
        
        // diferente
        var d = a != b ;
        System.out.println("d = " + d);
        
        // diferencias entre cadena
        String cad1 = "hola", cad2 = "Hola";
        var e = (cad1 == cad2); // no se evalua el contenido, si no la referencia de las var
        System.out.println("e = " + e);
        var f = cad1.equals(cad2); // evalua el contenido de las cadenas
        System.out.println("f = " + f);
        
        
        // Operadores de comparacion para tipos numericos
        var g = a > b;
        System.out.println("g = " + g);
        var h = a >= b;
        System.out.println("h = " + h);
        var i = a <= b;
        System.out.println("i = " + i);
        var j = a < b;
        System.out.println("j = " + j);
    }
}
