package Actividad_1.src.automoviles;

import Actividad_1.src.vehiculos.vehiculo; 


public final class auto extends vehiculo {
    
    private int cantidadPuertas;
    // Uso de final para una constante
    private final double CONSUMO_LITROS_POR_KM = 0.08; 

    public auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio); // super() invoca al constructor de Vehiculo
        setCantidadPuertas(cantidadPuertas);
    }

    // Encapsulamiento con validación
    public void setCantidadPuertas(int cantidadPuertas) {
        if(cantidadPuertas >= 2 && cantidadPuertas <= 5) {
            this.cantidadPuertas = cantidadPuertas;
        } else {
            System.out.println("Error: Cantidad de puertas inválida. Se asignan 4 por defecto.");
            this.cantidadPuertas = 4;
        }
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        return kilometros * CONSUMO_LITROS_POR_KM;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("AUTO: " + getMarca() + " " + getModelo() + " (" + getAnio() + ") - Puertas: " + cantidadPuertas);
    }
}