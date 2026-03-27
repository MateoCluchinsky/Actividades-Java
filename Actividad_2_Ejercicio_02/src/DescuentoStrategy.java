package Actividad_2_Ejercicio_02.src;

public interface DescuentoStrategy {
    // Recibe el subtotal y la cantidad de artículos para poder calcular el descuento
    double calcularDescuento(double subtotal, int cantidadArticulos);
}
