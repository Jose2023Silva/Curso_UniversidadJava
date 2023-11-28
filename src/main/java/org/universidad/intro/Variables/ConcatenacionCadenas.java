package org.universidad.intro.Variables;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        // inserta tu codigo aqui
        var nombre = "Jose Angel";
        var titulo = "Ingeniero";

        var union = nombre + titulo; //retorna Jose AngelIngeniero
        System.out.println("union = " + union);
        var union2 = titulo + " " + nombre; // Ingeniero Jose Angel
        System.out.println("union2 = " + union2);


        var i = 1; // se almacena un int
        var j = 5;
        var union3 = i + j; // retorna 6 ya que efectua una suma
        System.out.println("union3 = " + union3);
        var union4 = i + j + titulo; // retorna 6Ingeniero
        System.out.println("union4 = " + union4);
/*
primero hace una suma si hay mas numeros al inicio y despues lo concatena
con el String
*/
        var union5 = titulo + i + j; // Ingeniero15 -> se concatena todo como String
        System.out.println("union5 = " + union5);
// este se conoce contexto cadena ya que va de izquierda a derecha
        var union6 = titulo + (i + j); // Ingeniero6, da prioridad el parentesis y hace la operacion, al final lo concatena
        System.out.println("union6 = " + union6);
    }
}
