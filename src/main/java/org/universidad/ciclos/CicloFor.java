package org.universidad.ciclos;

/**
 *
 * @author Jose Angel Silva
 */
public class CicloFor {
    public static void main(String[] args) {
        /*
        Ciclo For
        
        Este ciclo es cuando se ejecuta si o si, y sale cuando la condicion o limite este definida
        tiene tres bloques detro del parentesis y separados por un ;
        primero es la inicializacion o inicio del bloque, despues la condicional para que este ejecutandose, y despues 
        es el que va a incrementar despues de haber dado la vuelta
        */
        for (int i = 0; i < 10; i++) {
            if(i%2 != 0){
                System.out.println("hola " + i);
                continue; // esta declaracion es indicar que el ciclo salte al siguiente iterador
            }
            
            // Uso del break para romper un ciclo si o si   
            else if(i == 6)
                break; // rompe el ciclo
            
            // Uso del continue
            
        }
    }
}
