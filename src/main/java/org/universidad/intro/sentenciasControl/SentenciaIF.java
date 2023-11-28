package org.universidad.intro.sentenciasControl;

/**
 *
 * @author Jose Angel Silva
 */
public class SentenciaIF {
    public static void main(String[] args) {
        var condicion = true;
        
        // creacion de un if - else
        if(condicion){
            // condicion cuando es verdadera y no ejecuta el else
            System.out.println("Es verdadero");
            
        }else{
            // se ejecuta cuando no es verdadera
            System.out.println("Es falsa la condicion, pero me ejecuto!");
        }
        
        // creando un if - else if
        var no = 5;
        if (no == 1) {
            System.out.println("Es 1");
        } else if(no == 2){
            System.out.println("Es 2");
        } else if (no == 3)
            System.out.println("es 3");
        
        // El uso de este tipo de condicional, si no cumple, no ejecuta nada como es el cado de if-else simple
    }
}
