package Actividad_2_Ejercicio_02.src;

public class Main {
    public static void main(String[] args) {
        // Un carrito con $1000 de subtotal y 6 artículos
        Carrito miCarrito = new Carrito(1000.0, 6);

        // Prueba 1: Aplicamos porcentaje fijo del 15%
        miCarrito.setEstrategia(new PorcentajeFijo(15));
        miCarrito.procesarPago();

        // Prueba 2: Cambiamos dinámicamente a Monto Máximo de $300
        miCarrito.setEstrategia(new MontoMaximo(300));
        miCarrito.procesarPago();

        // Prueba 3: Cambiamos a Descuento Progresivo (como tiene 6 artículos, le toca 10%)
        miCarrito.setEstrategia(new DescuentoProgresivo());
        miCarrito.procesarPago();
    }
}
