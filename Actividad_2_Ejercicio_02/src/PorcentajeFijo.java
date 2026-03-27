package Actividad_2_Ejercicio_02.src;

public class PorcentajeFijo implements DescuentoStrategy {
    private double porcentaje;

    public PorcentajeFijo(double porcentaje) {
        // Validación estricta: un porcentaje no puede ser negativo ni mayor a 100
        if (porcentaje >= 0 && porcentaje <= 100) {
            this.porcentaje = porcentaje;
        } else {
            System.out.println("Porcentaje inválido. Se aplicará 0%.");
            this.porcentaje = 0;
        }
    }

    @Override
    public double calcularDescuento(double subtotal, int cantidadArticulos) {
        return subtotal * (porcentaje / 100);
    }
}
