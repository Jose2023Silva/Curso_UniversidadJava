package org.universidad.lab.caja;

/**
 *
 * @author Jose Angel Silva
 */
public class Caja {
    private int ancho, largo, prof;
    
    public Caja(){
        this.ancho = 0;
        this.largo = 0;
        this.prof = 0;
    }
    
    public Caja(int ancho, int largo, int prof){
        this.ancho = ancho;
        this.largo = largo;
        this.prof = prof;
    }
    
    public int calcVolumen(){
        return this.ancho * this.largo * this.prof;
    }
    
    
}
