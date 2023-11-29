package org.universidad.intro.clases;

/**
 *
 * @author Jose Angel Silva
 */
public class PruebaPersona {
    public static void main(String[] args) {
        /*
        Esta clase es para hacer el manejo de la clase Persona
        */
        // Creando una var de la clase persona
        Persona person;
        // se crea el objeto y se instancia del constructor por defecto de java
        person = new Persona();
        person.nombre = "Jose Angel";
        person.genero = 'M';
        person.ocupacion = "Ing. en sistemas";
        person.desplegarInformacion();
        System.out.println("person = " + person);
    }
}
