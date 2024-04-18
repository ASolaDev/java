package clases;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    public void apagar() {
        System.out.println("El coche se ha parado");
    }

}
