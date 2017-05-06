/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public abstract class Cuidador extends Persona {
    private int cantidadDeRaciones;

    public Cuidador(int cantidadDeRaciones, String nombre, Date fechaNac) {
        super(nombre, fechaNac);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    
    public void alimentarAnimales(Zoologico z){
        if(this.cantidadDeRaciones >= z.RACIONES_POR_ANIMAL * z.CANTIDAD_ANIMALES ){
            System.out.println("La ración es suficiente.");
        } 
        else 
            System.out.println("La ración no es suficiente.");        
    }  

    
    
    

}
 
