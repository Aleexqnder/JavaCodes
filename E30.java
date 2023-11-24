/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java utiliza un bucle for para encontrar el menor de varios enteros.
# El usuario especifica el número de valores a comparar, y luego ingresa esos valores. El programa
# identifica y muestra el menor de los valores ingresados.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de valores a comparar: ");
        int cantidadValores = scanner.nextInt();

        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < cantidadValores; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("El menor valor ingresado es: " + menor);

        scanner.close();
    }
}
