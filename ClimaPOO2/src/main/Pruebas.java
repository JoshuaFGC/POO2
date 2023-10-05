package main;

import java.util.List;
import Region.*;


public class Pruebas {
	
    public static void main(String[] args) {
        // Llama al método crearRegiones de regConstruct para obtener la lista de regiones
        List<region> regiones = regConstruct.crearRegiones();
        
        for (region miRegion : regiones) {
        	miRegion.imprimirDatos();
        	System.out.println("-------------");
        }
        // Itera sobre la lista de regiones y muestra sus datos básicos
        for (region miRegion : regiones) {
   
            if(miRegion.getIdRegion()== 1  ) { ///Aca iria cambiando el id para mostrar otras regiones 
            	miRegion.imprimirDatosDispositivos();
        
            }
        }
        
        
    }
}
