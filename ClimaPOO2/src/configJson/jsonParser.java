package configJson;

import java.io.FileReader;


import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;


public class jsonParser {
	
	private JsonArray jsonHistorial;
	private JsonArray jsonRegiones;
	private int jsonTiempo;
	
	public void parsearJson(){
		String direccion = "C:\\Users\\Lenovo\\eclipse-workspace\\ClimaPOO2\\src\\configJson\\jsonfile.json";
		FileReader reader = null;
		try {
			reader = new FileReader(direccion);
			JsonReader reader_ = Json.createReader(reader);
			JsonObject parser = reader_.readObject();
			
			jsonRegiones = parser.getJsonArray("regiones");
			jsonHistorial = parser.getJsonArray("historiales");
			jsonTiempo = parser.getInt("tiempo");
		} catch(Exception e) {}
	}
	
	public JsonArray getJsonHistorial() {
		return jsonHistorial;
	}
	
	public JsonArray getJsonRegiones() {
		return jsonRegiones;
	}
	
	public int getJsonTime() {
		return jsonTiempo;
	}
}

