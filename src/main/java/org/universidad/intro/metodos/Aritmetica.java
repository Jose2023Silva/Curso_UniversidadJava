package org.universidad.intro.metodos;

/**
 *
 * @author Jose Angel Silva
 */
public class Aritmetica {
    // Se conoce como stack ya que se almacena datos dentro de una clase o metodo
    int a;
    int b;
    
    /**
     * Constructor cuando se crea un objeto y se inicializan los valores.
     * cuando se tiene vacio los parametros, el JVM provee uno por defecto sin 
     * necesidad de declararla.
     */
    public Aritmetica(){
        System.out.println("Se instancio un objeto");
        this.a = 0;
        this.b = 0;
    }
    
    public Aritmetica(int a, int b){
        System.out.println("Se instancion un objeto con parametros");
        this.a = a;
        this.b = b;
    }
    
    /**
     * Metodo publica de la clase que no retorna nada, es decir, vacio llamada
     * sumar y no contiene parametros de la funcion.
     */
    public void sumar(){
        var result = this.a + this.b;
        System.out.println("Suma: " + result);
    }
    
    /**
     * Suma de dos numeros.
     * @return la suma con un numero tipo int.
     */
    public int sumarConRetorno(){
        /*
        El uso del key this es para referir a los atributos de la clase, por lo que
        se puede tener variables con el mismo nombre pero con el this. se refiere 
        solamente a los atributos declarados
        */
        return this.a + this.b;
    }
    
    /**
     * Suma con argumanetos enteros
     * @param a tipo entero 
     * @param b tipo entero
     * @param c tipo entero
     * @return  suma de tres numeros enteros reales
     */
    public int sumaArgs(int a, int b, int c){
        return a + b + c ;
    }
}
