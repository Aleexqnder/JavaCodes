/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java calcula el área y el perímetro de un cuadrado
# basado en el lado proporcionado por el usuario. Utiliza variables de coma flotante para
# precisión decimal y muestra las fórmulas utilizadas junto con los resultados obtenidos.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double lado = entrada.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("\nFórmulas:");
        System.out.println("Área del cuadrado = Lado * Lado");
        System.out.println("Perímetro del cuadrado = 4 * Lado\n");

        System.out.println("Resultados:");
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);

        entrada.close();
    }
}
