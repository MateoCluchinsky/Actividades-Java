package Actividad_2.src;

public class Main {
    public static void main(String[] args) {
        GestorNotificaciones gestor = new GestorNotificaciones();

        // Suscribimos los canales al gestor
        gestor.agregarCanal(new Email());
        gestor.agregarCanal(new Push());
        gestor.agregarCanal(new SMS());

        // Simulamos el envío de notificaciones con diferentes severidades
        gestor.notificarSimultaneamente("El servidor está caído", Severidad.ALTA);
        gestor.notificarSimultaneamente("Nueva promoción disponible", Severidad.BAJA);
    }
}
