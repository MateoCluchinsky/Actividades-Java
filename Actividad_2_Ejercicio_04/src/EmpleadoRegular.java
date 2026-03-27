package Actividad_2_Ejercicio_04.src;

public class EmpleadoRegular implements Empleado, Imponible {
    private String nombre;
    private double salarioBase;

    public EmpleadoRegular(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double calcularSalario() { return salarioBase; }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado Regular: " + nombre);
    }

    @Override
    public double calcularImpuesto() {
        return salarioBase * 0.10; // Paga un 10% de impuestos
    }
}