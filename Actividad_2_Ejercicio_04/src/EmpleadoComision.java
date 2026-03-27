package Actividad_2_Ejercicio_04.src;

public class EmpleadoComision implements Empleado, Bonificable, Imponible {
    private String nombre;
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double salarioBase, double ventas, double porcentaje) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentaje;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * (porcentajeComision / 100));
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado por Comisión: " + nombre);
    }

    @Override
    public double calcularBonificacion() {
        // Si vende más de 5000, se le da un bono extra de 500
        return ventas > 5000 ? 500.0 : 0.0; 
    }

    @Override
    public double calcularImpuesto() {
        return calcularSalario() * 0.15; // Paga un 15% de impuestos sobre su salario total
    }
}