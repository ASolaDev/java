package OOP.atributosMetodos;

public class App {

    public static void main(String[] args) {
        Coche coche = new Coche("Renault", "Megane", 2012, 0, 0);
        
        Coche coche2 = new Coche("Seat", "Ibiza");
        coche2.arrancar();
        coche2.repostar(20);
        coche2.arrancar();
        coche2.viajar(100);
    }
    
}
