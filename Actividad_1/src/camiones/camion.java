package Actividad_1.src.camiones;

import Actividad_1.src.vehiculos.vehiculo;

public final class camion extends vehiculo {
    
    private double capacidadCargaToneladas;
    private final double CONSUMO_LITROS_POR_KM = 0.25; // El camión comsume más

    public camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        setCapacidadCarga(capacidadCarga);
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if(capacidadCarga > 0) {
            this.capacidadCargaToneladas = capacidadCarga;
        } else {
            System.out.println("Error: La carga debe ser positiva. Se asignan 5 toneladas.");
            this.capacidadCargaToneladas = 5.0;
        }
    }

    public double getCapacidadCargaToneladas() {
        return capacidadCargaToneladas;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        // Un camión gasta más si va cargado
        double consumoBase = kilometros * CONSUMO_LITROS_POR_KM;
        return consumoBase + (capacidadCargaToneladas * 0.02 * kilometros); 
    }

    @Override
    public void mostrarInfo() {
        System.out.println("CAMION: " + getMarca() + " " + getModelo() + " (" + getAnio() + ") - Carga Max: " + capacidadCargaToneladas + "t");
    }
}