package Actividad_2_Ejercicio_03.src;

import java.util.UUID;

public class Sesion {
    private String usuario;
    private String token;

    public Sesion(String usuario) {
        this.usuario = usuario;
        // Genera un token único y aleatorio
        this.token = UUID.randomUUID().toString(); 
    }

    public void mostrarInfo() {
        System.out.println("Sesión Activa -> Usuario: " + usuario + " | Token: [" + token + "]");
    }
}
