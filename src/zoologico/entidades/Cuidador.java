/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona {
    private int cantidadDeRaciones;

    public Cuidador(String nombre, Date fechaNac, int cantidadDeRaciones) {
        super(nombre, fechaNac);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    
    public void alimentarAnimales(){
        if(this.cantidadDeRaciones >= (Zoologico.RACIONES_POR_ANIMAL * Zoologico.CANTIDAD_ANIMALES)){
            System.out.println("La ración es suficiente.");
        } 
        else 
            System.out.println("La ración no es suficiente.");        
    }  

    
    
    

}
 
