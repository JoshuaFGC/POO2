package main;


import java.util.List;
import Region.*;


public class Main {
		
	public static void main(String[] args) {
	    // Llama al método crearRegiones de regConstruct para obtener la lista de regiones
		List<region> regiones = regConstruct.crearRegiones();
	        
	    for (region miRegion : regiones) {
	    	miRegion.imprimirDatos();
	        System.out.println("-------------");
	    }
	    
	    // Itera sobre la lista de regiones y muestra sus datos básicos
	    for (region miRegion : regiones) {
	    	if(miRegion.getIdRegion()== 1) { ///Aca iria cambiando el id para mostrar otras regiones
	    		miRegion.imprimirDatosDispositivos();	        
	        }
	    }	             
	}
}

/*El sistema consiste en regiones, las regiones tienen su configuracion
 * dada por un Json, luego, cada region tiene 2 dispositivos los cuales
 * tienen un hilo que genera datos con los datos brindados por el Json
 * estos dispositivos van a tener un min y un max para generar los datos
 * y tambien tienen metodos para calibrarse y descalibrarse, la descalibracion
 * sucede gracias a datos brindados por el Json, esto hara que los datos sean
 * incorrectos con el pasar del tiempo, entonces el metodo calibrar va a corregir
 * el min y el max para volver a dar datos correctos.
 * 
 * estrategia C: voy a implementar los controllers y las clases de mi modelo 
 * completas de tal forma que desde el controlador con un main yo pueda 
 * verificar que todo funciona correctamente y con sentido. Para ya al final 
 * solo hacer pantallas que es más sencillo y así tengo menos riesgo por 
 * si me dejan más trabajo en otro curso.
 */
