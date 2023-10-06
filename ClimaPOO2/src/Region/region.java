package Region;


import java.util.List;

import dispositivo.*;


public class region {

    private int id;
    private String nombre;
    private List<device> dispositivos;
    private double minBaro;
    private double maxBaro;
    private double minHigro;
    private double maxHigro;
    private double porcentaje;
    private double probabilidad;
    

    public region(int pIdRegion, String pNombre, double pMinBaro, double pMaxBaro, double pMinHigro, double pMaxHigro, 
    		double pPorcentaje, double pProbabilidad, List<device> pDispositivos) {
        this.id = pIdRegion;
        this.nombre = pNombre;
        this.dispositivos = pDispositivos;
        this.maxBaro = pMaxBaro;
        this.minBaro = pMinBaro;
        this.minHigro = pMinHigro;
        this.maxHigro = pMaxHigro;
        this.porcentaje = pPorcentaje;
        this.probabilidad = pProbabilidad;
        
    }

    public void imprimirDatos() {
        System.out.println("ID de Región: " + id);
        System.out.println("Nombre de Región: " + nombre);
        System.out.println("Minimo Barometro: " + minBaro);
        System.out.println("Maximo Barometro: " + maxBaro);
        System.out.println("Minimo Higrometro: " + minHigro);
        System.out.println("Maximo Higrometro: " + maxHigro);
        System.out.println("Porcentaje: " + porcentaje);
        System.out.println("Probabilidad: " + probabilidad);
        System.out.println("Dispositivos:");
        for (device dispositivo : dispositivos) {
            System.out.println("Tipo de Dispositivo: " + dispositivo.getClass().getSimpleName());
        }
    }

    public List<device> getDispositivos() {
        return dispositivos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdRegion() {
        return id;
    }
    
    public double getMinBaro() {
        return minBaro;
    }
    
    public double getMaxBaro() {
        return maxBaro;
    }
    
    public double getMinHigro() {
        return maxHigro;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
    
    public double getProbabilidad() {
        return probabilidad;
    }
    

    
    public void imprimirDatosDispositivos() {
        System.out.println("Región: " + nombre);
        for (device dispositivo : dispositivos) {
            for (int i = 0; i < 10; i++) { // Puedes ajustar la cantidad de datos a imprimir
            	System.out.println("Tipo de Dispositivo: " + dispositivo.getClass().getSimpleName());
            	Thread dispositivoThread = new Thread(dispositivo);
            	dispositivoThread.run(); // Ejecuta el dispositivo para generar un dato
            	
                try {
                    Thread.sleep(1000); // Espera 1 segundo antes de generar el siguiente dato (puedes ajustar el tiempo)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-------------------------");
        }
    }


}
