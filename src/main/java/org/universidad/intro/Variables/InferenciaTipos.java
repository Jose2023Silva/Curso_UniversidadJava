package org.universidad.intro.Variables;

public class InferenciaTipos {
    public static void main(String[] args) {
        var nombre = "Jose Angeles";
        System.out.println("nombre = " + nombre);
        var edad = (byte) 45; // se puede castear el dato para que sea la variable de tipo byte
        System.out.println("edad = " + edad);
        var pi = (float) 3.141516;
        System.out.println("pi = " + pi);
        var sexo = 'F';
        System.out.println("sexo = " + sexo);
        var esVerdadero = false;
        System.out.println("esVerdadero = " + esVerdadero);
        
        var numeroPi = Math.E;
        System.out.println("numeroPi = " + numeroPi);
        var clase = new StringBuffer();
        clase.append("Hola ");
        clase.append("Como Estas");
        System.out.println("clase = " + clase.getClass());
    }
}
