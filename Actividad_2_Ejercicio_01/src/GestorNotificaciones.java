package Actividad_2_Ejercicio_01.src;

import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones {
    private List<CanalNotificacion> canales;

    public GestorNotificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void notificarSimultaneamente(String mensaje, Severidad severidad) {
        System.out.println("\n--- INICIANDO ENVÍO SIMULTÁNEO (Severidad: " + severidad + ") ---");
        
        for (CanalNotificacion canal : canales) {
            // FILTRO DE SEVERIDAD: No mandamos SMS si la severidad es BAJA para ahorrar costos
            if (severidad == Severidad.BAJA && canal instanceof SMS) {
                System.out.println("[Filtro] SMS omitido porque la severidad es BAJA.");
                continue; // Salta a la siguiente iteración del bucle
            }
            
            // Polimorfismo en acción: ejecuta el enviar() específico de cada clase
            canal.enviar(mensaje, severidad);
        }
        System.out.println("------------------------------------------------------\n");
    }
}
