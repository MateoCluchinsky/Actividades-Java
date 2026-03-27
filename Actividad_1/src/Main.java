package Actividad_1.src;

import Actividad_1.src.vehiculos.vehiculo;
import Actividad_1.src.automoviles.auto;
import Actividad_1.src.motos.moto;
import Actividad_1.src.camiones.camion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE GESTIÓN DE VEHÍCULOS ---");

        // 1. Instanciación:
        auto miAuto = new auto("Toyota", "Corolla", 2022, 4);
        moto miMoto = new moto("Honda", "CBR", 2023, 600);
        camion miCamion = new camion("Volvo", "FH16", 2021, 20.5);
        
        // validación del encapsulamiento (ejemplo con año inválido)
        auto autoViejo = new auto("Ford", "T", 1800, 2); 

        System.out.println("\n--- CONSTRUCCIÓN FINALIZADA ---\n");

        // 2. Polimorfismo: todos en una lista de la superclase 'Vehiculo'
        List<vehiculo> flota = new ArrayList<>();
        flota.add(miAuto);
        flota.add(miMoto);
        flota.add(miCamion);
        flota.add(autoViejo);

        // 3. Demostración de métodos polimórficos
        double distanciaViaje = 100.0; // Calcular el consumo para 100 km
        System.out.println("--- REPORTE DE LA FLOTA (Viaje de " + distanciaViaje + " km) ---");

        for (vehiculo v : flota) {
            // Llama al método específico de cada subclase
            v.mostrarInfo(); 
            System.out.println("   -> Consumo estimado: " + v.calcularConsumo(distanciaViaje) + " litros.\n");
        }

        // 4. Demostración de la variable Static
        System.out.println("--- ESTADÍSTICAS GLOBALES ---");
        System.out.println("Total de vehículos instanciados en la memoria: " + vehiculo.getCantidadVehiculos());
    }
}
