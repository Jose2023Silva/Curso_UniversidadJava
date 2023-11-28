package org.universidad.intro.tiposPrimitivos;

/**
 *
 * @author Jose Angel Silva
 */
public class TiposFlotantes {
    public static void main(String[] args) {
        // Numeros de tipos flotantes
        float noFloat = 45.5f; // tiene que finalizar con f o F para identificar el float
        System.out.println(noFloat);
        float noF = (float) 456.5; // se puede castear por medio de (float)
        System.out.println(noF);
        
        
        // Los numeros decimales, por defecto, siempre sera en double, pero depende el espacio a almacenar
        double noDouble = 563.55666666; 
        System.out.println("noDouble = " + noDouble);
    }
}
