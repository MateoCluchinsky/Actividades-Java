package Actividad_2_Ejercicio_01.src;

public class Email implements CanalNotificacion {
    @Override
    public void enviar(String mensaje, Severidad severidad) {
        System.out.println("[EMAIL] Enviando correo electrónico...");
        System.out.println("   Severidad: " + severidad + " | Mensaje: " + mensaje);
    }
}
