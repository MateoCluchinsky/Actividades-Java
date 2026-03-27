package Actividad_2_Ejercicio_03.src;

public class AuthOAuth implements Autenticador {
    @Override
    public Sesion autenticar(String usuario, String credencial) {
        // Simular un token de Google o Facebook
        if (credencial.startsWith("oauth_token_")) {
            System.out.println("Éxito: Autenticado mediante proveedor OAuth (Google/Facebook).");
            return new Sesion(usuario);
        }
        return null;
    }
}
