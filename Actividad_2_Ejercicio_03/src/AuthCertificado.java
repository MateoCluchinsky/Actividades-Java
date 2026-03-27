package Actividad_2_Ejercicio_03.src;

public class AuthCertificado implements Autenticador {
    @Override
    public Sesion autenticar(String usuario, String credencial) {
        // Simular la lectura de un certificado digital (.p12, .pem)
        if (credencial.endsWith(".pem") || credencial.endsWith(".crt")) {
            System.out.println("Éxito: Autenticado mediante Certificado Digital.");
            return new Sesion(usuario);
        }
        return null;
    }
}
