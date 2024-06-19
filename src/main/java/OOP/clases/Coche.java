package oop.clases;

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

    // Método de la clase
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    // Método de la clase
    public void apagar() {
        System.out.println("El coche se ha parado");
    }

}
