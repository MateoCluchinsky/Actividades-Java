package Actividad_2_Ejercicio_02.src;

public class DescuentoProgresivo implements DescuentoStrategy {
    @Override
    public double calcularDescuento(double subtotal, int cantidadArticulos) {
        if (cantidadArticulos >= 10) {
            return subtotal * 0.20; // 20% si lleva 10 o más
        } else if (cantidadArticulos >= 5) {
            return subtotal * 0.10; // 10% si lleva entre 5 y 9
        } else {
            return 0; // Sin descuento si lleva menos de 5
        }
    }
}
