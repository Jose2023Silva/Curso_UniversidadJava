package org.universidad.intro.clases;

/**
 *
 * @author Jose Angel Silva
 * Esta es una clase en java que se diseña desde 0, por lo que la clase se llama persona
 * y este contiene metodos "Funciones" y atributos "valores de objeto".
 * Con la finalidad de crear clases con metodos y atributos.
 */
public class Persona {
    // atributos
    String nombre;
    char genero;
    String ocupacion;
    
    
    // creando un metodo que no retorne nada
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Genero: " + this.genero);
        System.out.println("Ocupacion: " + this.ocupacion);
    }
}
