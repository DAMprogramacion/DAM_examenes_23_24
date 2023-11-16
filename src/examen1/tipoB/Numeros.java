package examen1.tipoB;

import java.util.Scanner;
/*
Programa que solicita dos números y
despliega un menú para calcular:
Mostrar una secuencia hasta 100
Muestra un número elevado al otro
Muestra las raices cúbicas de ambos números
Los resultados se realizan en métodos aparte
 */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Introduce un número");
        int numero1 = sc.nextInt ();
        System.out.println ("Introduce un número");
        int numero2 = sc.nextInt ();
        int opcion = 0;
        String menu = """
                        1. Mostrar secuencia.
                        2. Obtener potencia.
                        3. Mostrar raices cúbicas.
                        4. Salir
                        INTRODUCE OPCIÓN:
                """;
        do {
            System.out.println ( menu );
            opcion = sc.nextInt ();
            switch (opcion) {
                case 1 -> mostrarSecuencia ( numero1, numero2 );
                case 2 -> System.out.printf ( "La potencia entre %d^%d vale %.2f%n",
                        numero1, numero2, calcularPotencia ( numero1, numero2 ) );
                case 3 -> mostrarRaizCubica ( numero1, numero2 ) ;
                case 4 -> {
                    System.out.println ( "\nFIN DEL PROGRAMAN" );
                    sc.close ();
                    System.exit ( 0 ); //salimos del programa
                }
            }
        } while (opcion >= 1 || opcion <= 4) ;


    }
    //método que muestra la secuencia numero1 numero1+numero2 numero1+numero2+numero2 ... 100 (exclusive)
    //el valor de 100 no se muestra, es el tope
    private static void mostrarSecuencia(int numero1, int numero2) {
        for ( int i = numero1; i < 100 ; i += numero2 ) {
            System.out.printf ("%d  ", i);
        }
        System.out.println ();
    }
    //método que devuelva el valor de numero1^numero2
    private static double calcularPotencia(int numero1, int numero2) {
        return Math.pow ( numero1, numero2 );
    }
    //método que muestra las raices cúbicas de numero1 y numero2
    private static void mostrarRaizCubica(int numero1, int numero2) {
        System.out.printf ( "La raı́z cúbica de %d es %.2f y la de %d es %.2f%n",
                numero1, Math.cbrt ( numero1 ), numero2, Math.cbrt ( numero2 ));
    }
}
