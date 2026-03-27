package Actividad_2_Ejercicio_03.src;

public class AuthBiometria implements Autenticador {
    @Override
    public Sesion autenticar(String usuario, String credencial) {
        // Simular que el lector de huellas envía un código que empieza con "huella_"
        if (credencial.startsWith("huella_")) {
            System.out.println("Éxito: Autenticado mediante Biometría (Huella Dactilar).");
            return new Sesion(usuario);
        }
        return null;
    }
}
