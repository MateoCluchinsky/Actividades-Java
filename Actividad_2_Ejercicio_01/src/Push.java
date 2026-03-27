package Actividad_2_Ejercicio_01.src;

public class Push implements CanalNotificacion {
    @Override
    public void enviar(String mensaje, Severidad severidad) {
        System.out.println("[PUSH] Notificación a la App Móvil...");
        System.out.println("   Severidad: " + severidad + " | Mensaje: " + mensaje);
    }
}