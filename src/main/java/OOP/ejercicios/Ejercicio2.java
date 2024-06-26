package oop.ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("José", "García López", 14);
        alumnos[1] = new Alumno("María", "Fernández Martín", 17);
        alumnos[2] = new Alumno("Raúl", "Miraflores Redondo", 11);
        alumnos[3] = new Alumno("Lucía", "Muñoz Seco", 16);
        alumnos[4] = new Alumno("Antonio", "De la Cruz Serón", 19);
        
        int posicionMasJoven = 0;
        
        for (int i = 1; i < alumnos.length; i++) {
            Alumno a1 = alumnos[posicionMasJoven];
            Alumno a2 = alumnos[i];
            
            /*
            if (a1.getEdad() > a2.getEdad()) {
                posicionMasJoven = i;
            }
            */
            
            if (alumnos[posicionMasJoven].getEdad() > alumnos[i].getEdad()) {
                posicionMasJoven = i;
            }
        }
        
        Alumno joven = alumnos[posicionMasJoven];
        System.out.println("El alumno más joven es %s %s con %d años".formatted(joven.getNombre(), joven.getApellidos(), joven.getEdad()));
    }

}
