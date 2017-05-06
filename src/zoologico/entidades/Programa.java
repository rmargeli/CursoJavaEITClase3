/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

public class Programa {
    
    public void abrirZoo(Zoologico z){
        z.abrirZoo();
    }
    
    public void cerrarZoo(Zoologico z){
        z.cerrarZoo();        
    }
    
      public static void main(String[] args){
          Zoologico z = new Zoologico();                    
          z.abrirZoo();    
          z.alimentarAnimales(100);
          z.cerrarZoo();   
          
      }
    
    
    
    
    
}
