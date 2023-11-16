package examen1.tipoB;

import java.util.Scanner;

public class Triangulo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        float angulo1 = 90, angulo2 = 0;
        do {
            System.out.println ("Introduce el valor de un ángulo");
            angulo2 = sc.nextFloat ();
        } while (angulo1 + angulo2 >= 180); //se repite el bucle hasta que se pueda formar el triángulo
        sc.close ();
        float angulo3 = 180 - angulo1 - angulo2;
        System.out.printf ( "Ángulo 1: %.2f, ángulo 2: %.2f y ángulo 3: %.2f%n", angulo1, angulo2, angulo3 );
    }
}
