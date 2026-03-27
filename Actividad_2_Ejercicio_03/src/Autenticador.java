package Actividad_2_Ejercicio_03.src;

public interface Autenticador {
    // Recibe el usuario y un dato de prueba (clave, huella o código OAuth)
    Sesion autenticar(String usuario, String credencial);
}
