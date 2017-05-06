
package zoologico.entidades;

import java.util.Date;


public class Zoologico {
    public static final int CANTIDAD_ANIMALES = 25;            //static: Variable de clase
    public static final int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;

  
    public void abrirZoo(){
        abierto = true;
        System.out.println("El zoologico está abierto.");
    }
    
    public void cerrarZoo(){
        abierto = false;
        System.out.println("El zoologico está cerrado.");        
    }
    
    public void alimentarAnimales(int raciones){
        Date date = new Date();
        Cuidador c = new Cuidador("Juan", date, raciones);
        c.alimentarAnimales();
    }
    
}