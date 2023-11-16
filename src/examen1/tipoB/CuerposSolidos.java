package examen1.tipoB;

import java.util.Scanner;

/*
Programa para el cálculo de las fórmulas de un cuerpo solido:
en este caso una esfera
area = 4 * PI * radio * radio
volumen = 4/3 * PI * radio * radio * radio
Los valores de volumen y área son short y long respectivamente
Se muestran los datos por consola.
 */
public class CuerposSolidos {
    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Introduce el radio de la esfera");
        float radio = sc.nextFloat ();
        sc.close ();
        short volumen = (short) ( 4.0 / 3 * PI * radio * radio * radio);
        long area     = (long) (4.0 * PI * Math.pow ( radio, 2 ) );
        System.out.printf ( "Una esfera de radio %.3f tiene un área de %d y un volumen de %d",
                radio, area, volumen);
    }
}
