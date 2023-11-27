package org.universidad.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadorAsignacion {
    public static void main(String[] args) {
        // OPERADORES DE ASGINACION
        int a = 3, b = 2;
        int c = a + 5 -b; // el = es una asignacion de valor
        System.out.println("c = " + c);
        
        // Incrementar un valor
        a += 3; // a =  a + 3
        System.out.println("a = " + a);
        
        // decrementar un valor
        a -= 1;
        System.out.println("a = " + a);
        
        // multiplica el valor a n cantidad de veces
        b *= 3;  // b = b*3;
        System.out.println("b = " + b);
        
        /*
        Ademas esta
        1. para dividir n cantidad de veces con /=
        2. para obtener el resto de una division con %=
        */
    }
}
