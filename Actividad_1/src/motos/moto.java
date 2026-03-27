package Actividad_1.src.motos;

import Actividad_1.src.vehiculos.vehiculo;

public final class moto extends vehiculo {
    
    private int cilindrada;
    private final double CONSUMO_LITROS_POR_KM = 0.04; // Las motos consumen menos

    public moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        setCilindrada(cilindrada);
    }

    public void setCilindrada(int cilindrada) {
        if(cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("Error: La cilindrada debe ser mayor a 0. Se asigna 110cc.");
            this.cilindrada = 110;
        }
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        return kilometros * CONSUMO_LITROS_POR_KM;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("MOTO: " + getMarca() + " " + getModelo() + " (" + getAnio() + ") - Cilindrada: " + cilindrada + "cc");
    }
}