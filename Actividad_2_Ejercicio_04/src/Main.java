package Actividad_2_Ejercicio_04.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoRegular("Ana", 3000));
        empleados.add(new EmpleadoComision("Juan", 2500, 10000, 5));
        empleados.add(new EmpleadoHoras("Pedro", 45, 20));

        System.out.println("--- REPORTE DE NÓMINA DINÁMICA ---");
        double nominaTotal = 0;

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            
            double salario = emp.calcularSalario();
            double bonificacion = 0.0;
            double impuesto = 0.0;

            // Verifica si tiene las capacidades adicionales
            if (emp instanceof Bonificable) {
                // Hace el casting (Bonificable) emp para usar el método
                bonificacion = ((Bonificable) emp).calcularBonificacion();
            }

            if (emp instanceof Imponible) {
                impuesto = ((Imponible) emp).calcularImpuesto();
            }

            double salarioFinal = salario + bonificacion - impuesto;
            nominaTotal += salarioFinal;

            System.out.println("   Salario Base : $" + salario);
            System.out.println("   Bonificación : +$" + bonificacion);
            System.out.println("   Impuestos    : -$" + impuesto);
            System.out.println("   SALARIO FINAL: $" + salarioFinal);
            System.out.println("----------------------------------");
        }

        System.out.println("TOTAL A PAGAR EN NÓMINA: $" + nominaTotal);
    }
}