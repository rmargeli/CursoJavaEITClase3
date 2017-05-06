
package zoologico;


public class Zoologico {
    public final int CANTIDAD_ANIMALES = 25;
    public final int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;

  
    public void abrirZoo(){
        abierto = true;
        System.out.println("El zoologico está abierto.");
    }
    
    public void cerrarZoo(){
        abierto = false;
        System.out.println("El zoologico está cerrado.");        
    }      
    
}