package dispositivo;
import java.util.Random;


public class device {
	
	protected String nombre;
	protected double min;
	protected double max;
	protected double probabilidad;
	protected double porcentaje;
	
	
	public void run() {
		
		
		Random random = new Random();
		while(true) {

			if (random.nextDouble() < probabilidad) {
				descalibrar();
			}
			
			double dato = min + random.nextFloat() * (max-min);
			System.out.println(dato);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void calibrar(double pMin, double pMax) {
		min = pMin;
		max = pMax;
	}
	
	public void descalibrar(){
		Random random2 = new Random();
		double factorDescalibracion = 1 + (double)(random2 .nextDouble() * porcentaje * 2 - porcentaje);
		min -= min * factorDescalibracion;
		max += max * factorDescalibracion;
		
	}
}
