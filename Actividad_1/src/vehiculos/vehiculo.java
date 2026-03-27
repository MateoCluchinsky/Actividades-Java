package Actividad_1.src.vehiculos;

public abstract class vehiculo {
    // 1. Atributos privados
    private String marca;
    private String modelo;
    private int anio;
    
    // 2. Contador Global (Static)
    private static int contadorVehiculos = 0; 

    // Constructor
    public vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        setAnio(anio);
        contadorVehiculos++;
    }

    // 3. Métodos Abstractos
    public abstract double calcularConsumo(double kilometros);
    public abstract void mostrarInfo();

    // 4. Método Static para leer el contador
    public static int getCantidadVehiculos() {
        return contadorVehiculos;
    }

    // 5. Getters y Setters con validación
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: La marca no puede estar vacía.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: El modelo no puede estar vacío.");
        }
    }

    public int getAnio() {
        return anio;
    }

    // Validación estricta
    public void setAnio(int anio) {
        if(anio > 1885) { // El primer auto se inventó en 1886
            this.anio = anio;
        } else {
            System.out.println("Error: Año inválido. Se asignará 2000 por defecto.");
            this.anio = 2000;
        }
    }
}
