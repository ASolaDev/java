package variables;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        // Operadores de comparación
        int n1 = 2;
        int n2 = 1;
        boolean r;
        
        // Mayor que
        r = n1 > n2;
        System.out.println(r);
        
        // Mayor o igual que
        r = n1 >= n2;
        System.out.println(r);
        
        // Menor que
        r = n1 < n2;
        System.out.println(r);
        
        // Menor o igual que
        r = n1 <= n2;
        System.out.println(r);
        
        //Iguales
        r = n1 == n2;
        System.out.println(r);
        
        // Distintos
        r = n1 != n2;
        System.out.println(r);
        System.out.println("-------------------------");
        
        // Operadores Lógicos
        
        //AND
        int x1 = 5;
        boolean c1 = x1 > 0;
        boolean c2 = x1 < 10;
        boolean c3 = c1 && c2;
        System.out.println(c3);
        
        //OR
        int z1 = 5;
        boolean f1 = z1 > 5;
        boolean f2 = z1 < 5;
        boolean f3 = f1 || f2;
        System.out.println(f3);
        
        // NOT
        boolean v = true;
        boolean v2 = !v;
        System.out.println(v2);
    }

}
