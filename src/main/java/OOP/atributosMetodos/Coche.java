package oop.atributosMetodos;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual;
    private double litrosEnDeposito;
    
    public Coche() {}

    public Coche(String marca, String modelo, int anio, double velocidadActual, double litrosEnDeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        this.litrosEnDeposito = litrosEnDeposito;
    }
    
    public Coche(String marca, String modelo) {
        this(marca, modelo, 2020,  0, 0);
    }
    
    public Coche(String marca, int anio) {
        this(marca, null, anio, 0, 0);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getLitrosEnDeposito() {
        return litrosEnDeposito;
    }

    public void setLitrosEnDeposito(double litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
    }
    
    public void arrancar() {
        if (this.litrosEnDeposito > 0)  {
            System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, anio));
        } else {
            System.out.println("El coche no puede arrancar sin gasolina".formatted(marca, modelo, anio));
        }
    }
    
    public void apagar() {
        System.out.println("El coche %s %s %d se ha parado.".formatted(marca, modelo, anio));
    }
    
    // Método que incrementa el deposito del coche con el número de litros indicado
    public double repostar(double cantidad) {
        this.litrosEnDeposito += cantidad;
        return litrosEnDeposito;
    }
    
    public double acelerar(double incrementoVelocidad) {
        this.velocidadActual += incrementoVelocidad;
        return velocidadActual;
    }
    
    public double viajar(double kilometros) {
        // Comprobamos que el coche puede hacer el viaje
        if (kilometros * 0.07 <= litrosEnDeposito) {
            double tiempoEnHoras = kilometros / velocidadActual;
            double tiempoEnSegundos = tiempoEnHoras * 60 * 60;
            this.litrosEnDeposito -= kilometros * 0.07;
            System.out.println("Tras el viaje, el depósito ha quedado con %.2f litros".formatted(litrosEnDeposito));
            return tiempoEnSegundos;
        } else {
            System.out.println("Para poder hacer el viaje necesitas repostar.");
            return 0;
        }
    }
}
