package variables;

public class InferenciaDatos {
    
    public static void main(String[] args) {

        // Desde Java10 con var detecta el tipo de dato que le sigue
        var cadena = "Hola a todos";
        var x = 7;
        var decimal = 123.456;

        System.out.println(cadena);
        System.out.println(x);
        System.out.println(decimal);
    }
    
}
