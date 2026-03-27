package Actividad_2_Ejercicio_03.src;

public class AuthUsuarioPassword implements Autenticador {
    @Override
    public Sesion autenticar(String usuario, String credencial) {
        // Simular una validación en base de datos
        if (usuario.equals("admin") && credencial.equals("123456")) {
            System.out.println("Éxito: Autenticado mediante Usuario y Contraseña.");
            return new Sesion(usuario);
        }
        return null;
    }
}
