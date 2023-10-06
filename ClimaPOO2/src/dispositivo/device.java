package dispositivo;

import java.util.Random;


public class device implements Runnable{
	
	protected String nombre;
	protected double min;
	protected double max;
	protected double probabilidad;
	protected double porcentaje;
	boolean pCalibracion; //Para la validacion de una nueva calibracion
	
	

	
	public void calibrar(double pMin, double pMax) {
		min = pMin;
		max = pMax;
	}
	
	public boolean calibracion() {
		return pCalibracion;
	}
	
	public void descalibrar(){
		Random random2 = new Random();
		double factorDescalibracion = 1 + (double)(random2 .nextDouble() * porcentaje * 2 - porcentaje);
		min -= min * factorDescalibracion;
		max += max * factorDescalibracion;
	}

	@Override
	public void run() {
		Random random = new Random();
        while (true) {
            if (random.nextDouble() < probabilidad) {
                descalibrar();
            }
            //Validacion para cuando tenga la interfaz conectada
            /*if (pCalibrar){
             	calibrar(pMin, pMax);
              }
             */
            
            double dato = min + random.nextFloat() * (max - min);
            System.out.println(dato);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


