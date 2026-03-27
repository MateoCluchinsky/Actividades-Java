package Actividad_2_Ejercicio_03.src;

import java.util.ArrayList;
import java.util.List;

public class GestorAutenticacion {
    private List<Autenticador> cadenaDeMando;

    public GestorAutenticacion() {
        this.cadenaDeMando = new ArrayList<>();
    }

    // Permite configurar la cadena dinámicamente
    public void agregarMetodo(Autenticador auth) {
        cadenaDeMando.add(auth);
    }

    public Sesion iniciarSesion(String usuario, String credencial) {
        System.out.println("\n--- Intentando inicio de sesión para: " + usuario + " ---");
        
        for (Autenticador auth : cadenaDeMando) {
            Sesion sesionGenerada = auth.autenticar(usuario, credencial);
            
            if (sesionGenerada != null) {
                return sesionGenerada;
            }
        }
        
        // Si el bucle termina y nadie pudo autenticarlo:
        System.out.println("Acceso Denegado: Ningún método de autenticación reconoció la credencial.");
        return null;
    }
}