package diseño_clases.argumentos_tiposRetorno;

public class Rectangulo {
    
    private final int COOR_X = 0;
    private final int COOR_Y = 1;
    
    private double [] c1, c2, c3, c4;
    
    public Rectangulo() {
        c1 = new double[2];
        c2 = new double[2];
        c3 = new double[3];
        c4 = new double[4];
    }

    public Rectangulo(double[] c1, double[] c2, double[] c3, double[] c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }
    
    
}
