package org.universidad.intro.tiposPrimitivos;

/**
 *
 * @author Jose Angel Silva
 */
public class TiposEnteros {
    public static void main(String[] args) {
        /*
        Los tipos primitivos tipos enteros son los siguientes
        byte
        short
        char -> se usa para escribir el numero de caracter, no almacena el numero
        int  
        long
        */
        
        byte noByte = 10;
        System.out.println("noByte = " + noByte);
        System.out.println("Valor Min = " + Byte.MIN_VALUE);
        System.out.println("Valor Max = " + Byte.MAX_VALUE);
        
        byte noByte1 = (byte)265; //Forzar a pedir que sea un tipo byte pero varia su valor
        // Esto se le conoce como casteo de informacion para forzar a que sea el tipo de dato a almacenar
        System.out.println("noByte1 = " + noByte1);
        
        
    }
}
