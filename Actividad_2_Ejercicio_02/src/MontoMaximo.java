package Actividad_2_Ejercicio_02.src;

public class MontoMaximo implements DescuentoStrategy {
    private double descuentoFijo;

    public MontoMaximo(double descuentoFijo) {
        this.descuentoFijo = Math.max(0, descuentoFijo); // Evita descuentos negativos
    }

    @Override
    public double calcularDescuento(double subtotal, int cantidadArticulos) {
        // Si el descuento es de $500 pero el subtotal es $300, solo descontamos $300
        return Math.min(descuentoFijo, subtotal);
    }
}