package org.universidad.DataType;

import java.util.Scanner;

/**
 *
 * @author Jose Angel Silva
 */
public class ConversionPrimitivos {
    public static void main(String[] args) {
        // conversion entre cadenas y enteros
        var edad = "20"; // cadena que almacena 20
        System.out.println("edad = " + edad);
        var edadEn = Integer.parseInt(edad); // comvirtiendo un valor string a un tipo int
        System.out.println("edadEn = " + (edadEn+1));
        
        var edadDecimal =  Double.parseDouble("3.141516"); // convirtiendo a un valor decimal
        System.out.println("edadDecimal = " + edadDecimal);
        
        
        // Solicitando por mediante consola
        var inp = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edadInp = inp.nextLine();
        System.out.println("edadInp = " + edadInp);
        var edadReal = Byte.parseByte(edadInp); // conversion a un tipo byte
        System.out.println("edadReal = " + edadReal);
        
        
        // manejo de String.valueof
        var edadTexto = String.valueOf(10); // conversion de un tipo a String.
        System.out.println("edadTexto = " + edadTexto);
        
        var character = "Hola".charAt(2); // se menciona el indice de 0 a n
        System.out.println("character = " + character);
        System.out.print("Ingrese un caracter: ");
        var carInp = inp.nextLine().charAt(0); // se recibe el primer caracter de la cadena
        System.out.println("carInp = " + carInp);
    }
}
