package org.universidad.intro.ciclos;

/**
 *
 * @author Jose Angel Silva
 */
public class CicloWhile {
    public static void main(String[] args) {
        /*
        LOOP WHILE
        este ciclo se ejecuta cuando una condicion es verdadera, por lo que se puede repetir 
        n cantidad de veces hasta que la condicion sea falsa
        */
        
        var cont = 0;
        while (cont <= 5) {    
            // Ejecuta todo el bloque siempre cuando la condicion sea true
            System.out.println("hola " + cont);
            ++cont;
        } // finaliza el bucle 
    }
}
