package Actividad_2.src;

public class SMS implements CanalNotificacion {
    @Override
    public void enviar(String mensaje, Severidad severidad) {
        // Los SMS cuestan dinero, podemos simular una lógica distinta aquí
        System.out.println("[SMS] Enviando mensaje de texto al número registrado...");
        System.out.println("   Severidad: " + severidad + " | Mensaje: " + mensaje);
    }
}