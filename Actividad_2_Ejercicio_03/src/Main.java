package Actividad_2_Ejercicio_03.src;

public class Main {
    public static void main(String[] args) {
        GestorAutenticacion gestor = new GestorAutenticacion();

        gestor.agregarMetodo(new AuthBiometria());
        gestor.agregarMetodo(new AuthCertificado());
        gestor.agregarMetodo(new AuthOAuth());
        gestor.agregarMetodo(new AuthUsuarioPassword());

        // Acceso correcto con contraseña
        Sesion s1 = gestor.iniciarSesion("admin", "123456");
        if (s1 != null) s1.mostrarInfo();

        // Acceso correcto con huella digital
        Sesion s2 = gestor.iniciarSesion("juan_perez", "huella_98765");
        if (s2 != null) s2.mostrarInfo();

        // Acceso correcto con certificado
        Sesion s3 = gestor.iniciarSesion("empresa_sa", "clave_publica.pem");
        if (s3 != null) s3.mostrarInfo();

        // Un intruso con clave incorrecta y sin huella válida
        Sesion s4 = gestor.iniciarSesion("hacker", "password123");
        if (s4 != null) s4.mostrarInfo();
    }
}
