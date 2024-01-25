package estructuras_control;

public class IfElse {

    public static void main(String[] args) {
        int nota = 10;
        
        if (nota >= 5) {
            System.out.println("APROBADO");
        } else {
            System.out.println("SUSPENSO");
        }
        
        // Bloque else no obligatorio
        float precio = 12.34f;
        float iva = 0.21f;
        
        if (iva > 0) {
            precio += precio * iva;
        }
        
        System.out.println("El precio del producto es: " + precio);
        
        // Condiciones más complejas
        int edad = 27;
        final int edadMinimaTrabajo = 16;
        final int edadJubilacion = 67;
        
        if (edad >= edadMinimaTrabajo && edad <= edadJubilacion) {
            System.out.println("Puedes trabajar");
        } else {
            System.out.println("No puedes trabajar");
        }
        
        // Sin llaves obligatorias con una sola sentencia
        if (nota >= 9) System.out.println("Tienes un sobresaliente");
        
        if (nota >= 7 && nota < 9)
            System.out.println("Tienes un notable");
        
        // If - Else if - else
        int num = 7;
        
        if (num < 0) {
            System.out.println("El número es negativo");
        } else if (num  == 0) {
            System.out.println("El número es cero");
        } else if (num > 0 && num < 10) {
            System.out.println("El número es un dígito positivo");
        } else {
            System.out.println("El número es mayor o igual a 10");
        }
    }

}
