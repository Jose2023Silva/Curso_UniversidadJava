package org.universidad.intro.ciclos;

/**
 *
 * @author Jose Angel Silva
 */
public class EtiquetasLoops {
    public static void main(String[] args) {
        /*
        Uso de etiquetas en java
        
        */
        var val = 18;
        var prod = 0;
        // se usa la etiquea para referencia de un bloque
        busquedaResultado:
        for (int i = 1; i < 10; i++) {
            System.out.println("for 1");
            System.out.println(i);
            for (int j = 1; j < 10; j++) {
                System.out.println("for 2");
                prod = i * j;
                if(val == prod)
                    break busquedaResultado;
            }
        }
        
        System.out.println("Se encontro el valor");
    }
}
