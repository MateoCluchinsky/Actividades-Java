package Actividad_2_Ejercicio_04.src;

public class EmpleadoHoras implements Empleado, Bonificable {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoHoras(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horasTrabajadas = horas;
        this.tarifaHora = tarifa;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado por Horas: " + nombre);
    }

    @Override
    public double calcularBonificacion() {
        // Bono por puntualidad/esfuerzo si trabaja más de 40 horas
        return horasTrabajadas > 40 ? 100.0 : 0.0;
    }
}