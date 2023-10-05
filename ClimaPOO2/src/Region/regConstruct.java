package Region;

import configJson.jsonParser;
import dispositivo.*;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class regConstruct {
	
	public static List<region> crearRegiones() {
		jsonParser parser = new jsonParser();
	    parser.parsearJson();
	    JsonArray jsonRegiones = parser.getJsonRegiones();

	    List<region> regiones = new ArrayList<>();

	    int id = 0;
	    for (JsonObject objeto : jsonRegiones.getValuesAs(JsonObject.class)) {
	    	id += 1;
	        String nombre = objeto.getString("nombre");
	        String nombreRegion = objeto.getString("nombre");
	        double minBaro = objeto.getJsonNumber("minBaro").doubleValue();
	        double maxBaro = objeto.getJsonNumber("maxBaro").doubleValue();
	        double minHigro = objeto.getJsonNumber("minHigro").doubleValue();
	        double maxHigro = objeto.getJsonNumber("maxHigro").doubleValue();
	        double porcentaje = objeto.getJsonNumber("porcentaje").doubleValue();
	        double probabilidad = objeto.getJsonNumber("probabilidad").doubleValue();

	        // Crear y configurar el barómetro
	        barometro baro = crearBarometro(nombreRegion, minBaro, maxBaro, probabilidad, porcentaje);

	        // Crear y configurar el higrómetro
	        higrometro higro = crearHigrometro(nombreRegion, minHigro, maxHigro, probabilidad, porcentaje);

	        regiones.add(new region(id, nombre, minBaro, maxBaro, minHigro, maxHigro, porcentaje, probabilidad, Arrays.asList(baro, higro)));
	    }
	    return regiones;
	}
	


	private static barometro crearBarometro(String nombreRegion, double min, double max, double probabilidad, double porcentaje) {
		return new barometro("Barometro de " + nombreRegion, min, max, probabilidad, porcentaje);
	}

	private static higrometro crearHigrometro(String nombreRegion, double min, double max, double probabilidad, double porcentaje) {
		return new higrometro("Higrometro de " + nombreRegion, min, max, probabilidad, porcentaje);
	    }
}