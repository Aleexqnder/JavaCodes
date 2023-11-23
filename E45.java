/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java solicita al usuario ingresar dos números y calcula la potencia
# del primer número elevado al segundo. Maneja casos de exponentes positivos, negativos o cero sin usar
# la librería math.h. Se ha modificado utilizando funciones y ciclos para mejorar la estructura y legibilidad del código.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        // Calcular la potencia y mostrar el resultado
        double resultado = calcularPotencia(base, exponente);
        System.out.printf("El resultado de %.2f elevado a %d es: %.2f%n", base, exponente, resultado);

        scanner.close();
    }

    // Función para calcular la potencia
    private static double calcularPotencia(double base, int exponente) {
        double resultado = 1.0;

        // Manejar casos de exponente positivo, negativo o cero
        if (exponente > 0) {
            resultado = elevarPositivo(base, exponente);
        } else if (exponente < 0) {
            resultado = elevarNegativo(base, -exponente);
        }

        // Si el exponente es cero, resultado ya es 1.0

        return resultado;
    }

    // Función para elevar a exponente positivo
    private static double elevarPositivo(double base, int exponente) {
        double resultado = 1.0;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    // Función para elevar a exponente negativo
    private static double elevarNegativo(double base, int exponente) {
        double resultado = 1.0;

        for (int i = 0; i < exponente; i++) {
            resultado /= base;
        }

        return resultado;
    }
}
