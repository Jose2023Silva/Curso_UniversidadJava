package org.universidad.intro.operadores;

/**
 *
 * @author Jose Angel Silva
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a; // cambio de signo de valor numerico
        System.out.println("b = " + b);
        
        // operador unario de boolean
        var c = true; // valor boolean
        var d = !c;   // negando un boolean
        System.out.println("d = " + d);
        
        // Incremento
        //  1. PRE - INCREMENTO
        var e = 3;
        System.out.println("e = " + e);
        var f = ++e; // un preincremento a 1 a la var e y se asigna a f
        System.out.println("f = " + f);
        System.out.println("e = " + e); // se ve el valor ya incrementado
        
        //  2. POST - INCREMENTO
        var g = 5;
        System.out.println("g = " + g);
        var h = g++; // primero toma el valor de g y luego lo incrementa
        System.out.println("g = " + g); // se ve el nuevo valor
        System.out.println("h = " + h); // se ve el antiguo valor de g en el var h
        
        
        // Decremento
        //  1. PRE - DECREMENTO
        var i = 6;
        System.out.println("i = " + i);
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        
        //  2. POST - DECREMENTO
        var k = i--;
        System.out.println("i = " + i);
        System.out.println("k = " + k);
    }
}
