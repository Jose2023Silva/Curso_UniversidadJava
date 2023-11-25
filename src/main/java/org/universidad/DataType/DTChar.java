package org.universidad.DataType;

public class DTChar {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println("c = " + c);
        char caracterASCII = 34; // ASCII por numero decimal hasta 252
        System.out.println("caracterASCII = " + caracterASCII);
        char caracterUNICODE = '\u0022'; // UNICODE que tiene que mas capacidad de caracteres
        System.out.println("caracterUNICODE = " + caracterUNICODE);
        
        // usando var
        var caracterEspecialURSS = (char) '\u262d';
        System.out.println("caracterEspecialURSS = " + caracterEspecialURSS);
        var caracter = (char) 173;
        System.out.println("caracter = " + caracter);

        // cuando se usa un caracter en una variable tipo int, adquiere el numero de caracteer
        int valorCaracter = '\u262d'; // puede sar valor caracter o unicode
        System.out.println("valorCaracter = " + valorCaracter);
    }
}
