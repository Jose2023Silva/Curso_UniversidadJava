package org.universidad.intro.Variables;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        // inserta tu codigo aqui
        var nombre = "Nueva linea: \n Karla";
        System.out.println("nombre = " + nombre);
/*
Nueva linea:
Karla
*/
        var tabulador = "Tabulador: \t karla";
        System.out.println("tabulador = " + tabulador);
/*
Tabulador:     Karla
*/
        var retroseso = "Retroseso:  \bKarla";
        System.out.println("retroseso = " + retroseso);
/*
Retroseso: Karla // se regresa solo un espacio hacia atras
*/
        var comilla = "\'" + "Karla" + "\'";//'Karla'
        System.out.println("comilla = " + comilla);
        var comillaDoble = String.format("\"%s\"", "Karla"); // "Karla"
        System.out.println("comillaDoble = " + comillaDoble);
    }
}
