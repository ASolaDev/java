package oop.constructores;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    // Constructor que llama al primer constructor
    public Coche(String marca, String modelo) {
        this(marca, modelo, 2020);
    }
    
    // Constructor que llama al primer constructor
    public Coche(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }
    
    // Método de la clase
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }
    
    // Método de la clase
    public void apagar() {
        System.out.println("El coche se ha parado");
    }

}
