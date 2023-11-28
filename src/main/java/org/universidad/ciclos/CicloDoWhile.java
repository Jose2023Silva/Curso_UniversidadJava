package org.universidad.ciclos;

/**
 *
 * @author Jose Angel Silva
 */
public class CicloDoWhile {
    public static void main(String[] args) {
        /*
        Ciclo DO - WHILE
        Este ciclo, primero ejecuta y luego valida, si la validacion es verdadera, 
        de nuevo tiene que hacer los pasos ejecutados, en caso de que no, continua con el flujo de trabajo
        
        */
        var cont = 0;
        do {            
            // Se ejecuta la primera vez, despues condiciona y si en caso de ser verdadero, lo ejecuta lo que esta 
            // dentro del bloque
            System.out.println("hola " + cont);
            ++cont;
        } while (cont < 5); // Evalua la condicion.
        System.out.println(cont);
    }
}
