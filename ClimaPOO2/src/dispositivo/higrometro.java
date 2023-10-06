package dispositivo;

public class higrometro extends device{

	
	public higrometro(String pNombre, double pMin, double pMax, double pProbabilidad, double pPercDescalibre) {
		nombre = pNombre;
		min = pMin;
		max = pMax;
		probabilidad = pProbabilidad;
		porcentaje = pPercDescalibre;
	}
	

	public void calibrarHigro(double pMin, double pMax) {
		super.calibrar(pMin, pMax);
	}


	public void descalibrar(){
		super.descalibrar();
		
	}
}
