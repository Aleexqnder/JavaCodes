/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java solicita al usuario ingresar números enteros 
no negativos hasta que se ingresa un número negativo.
# Luego, imprime una tabla con los valores calculados según las fórmulas especificadas en el enunciado, 
incluyendo totales y promedios.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int sumaN = 0, sumaN2 = 0, sumaN3 = 0, suma2NMenos1 = 0;
        int cantidadNumeros = 0;

        System.out.println("Ingrese números enteros no negativos. Ingrese un número negativo para finalizar.");

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                cantidadNumeros++;
                sumaN += numero;
                sumaN2 += numero * numero;
                sumaN3 += numero * numero * numero;
                suma2NMenos1 += 2 * numero - 1;
            }

        } while (numero >= 0);

        // Imprimir la tabla
        System.out.printf("%-5s%-5s%-5s%-5s\n", "N", "N2", "N3", "2N-1");

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.printf("%-5d%-5d%-5d%-5d\n", i, i * i, i * i * i, 2 * i - 1);
        }

        // Imprimir totales
        System.out.printf("%-5s%-5d%-5d%-5d%-5d\n", "Totales", sumaN, sumaN2, sumaN3, suma2NMenos1);

        // Imprimir promedios
        double promedioN = (double)sumaN / cantidadNumeros;
        double promedioN2 = (double)sumaN2 / cantidadNumeros;
        double promedioN3 = (double)sumaN3 / cantidadNumeros;
        double promedio2NMenos1 = (double)suma2NMenos1 / cantidadNumeros;

        System.out.printf("%-5s%-5.2f%-5.2f%-5.2f%-5.2f\n", "Promedios", promedioN, promedioN2, promedioN3, promedio2NMenos1);

        scanner.close();
    }
}
