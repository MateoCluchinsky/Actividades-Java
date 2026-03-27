package Actividad_2_Ejercicio_02.src;

public class Carrito {
    private double subtotal;
    private int cantidadArticulos;
    private DescuentoStrategy estrategiaActual;

    public Carrito(double subtotal, int cantidadArticulos) {
        this.subtotal = Math.max(0, subtotal);
        this.cantidadArticulos = Math.max(0, cantidadArticulos);
    }

    // Método clave: Permite cambiar la estrategia en tiempo de ejecución
    public void setEstrategia(DescuentoStrategy estrategia) {
        this.estrategiaActual = estrategia;
    }

    public void procesarPago() {
        System.out.println("\n--- PROCESANDO CARRITO ---");
        System.out.println("Subtotal: $" + subtotal + " | Artículos: " + cantidadArticulos);

        if (estrategiaActual == null) {
            System.out.println("Error: No se ha configurado ninguna estrategia de descuento.");
            return;
        }

        double descuento = estrategiaActual.calcularDescuento(subtotal, cantidadArticulos);
        double totalFinal = subtotal - descuento;

        System.out.println("Descuento aplicado: -$" + descuento);
        System.out.println("Total a Pagar: $" + totalFinal);
        System.out.println("--------------------------");
    }
}
