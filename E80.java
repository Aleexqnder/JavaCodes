/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java utiliza una librería propia llamada TablaLib para
 construir y mostrar una tabla con valores
# del seno, coseno y tangente para los grados en el rango de 0 a 360. La librería TablaLib incluye
 funciones para imprimir encabezados
# de columnas, calcular el seno, coseno y tangente, y hacer una pausa cada 50 valores.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TablaLib.imprimirEncabezados();

        for (int grados = 0; grados <= 360; grados++) {
            double radianes = TablaLib.gradosToRadianes(grados);
            double seno = TablaLib.calcularSeno(radianes);
            double coseno = TablaLib.calcularCoseno(radianes);
            double tangente = TablaLib.calcularTangente(radianes);

            TablaLib.imprimirFila(grados, seno, coseno, tangente);

            // Hacer una pausa cada 50 valores
            if (grados % 50 == 0 && grados != 0) {
                System.out.println("Presione cualquier tecla para continuar...");
                scanner.nextLine(); // Esperar a que el usuario presione enter
                TablaLib.imprimirEncabezados();
            }
        }

        scanner.close();
    }
}

class TablaLib {
    // Función para imprimir encabezados de columnas
    public static void imprimirEncabezados() {
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Grados", "Seno", "Coseno", "Tangente");
    }

    // Función para convertir grados a radianes
    public static double gradosToRadianes(int grados) {
        return grados * (Math.PI / 180);
    }

    // Función para calcular el seno
    public static double calcularSeno(double radianes) {
        return Math.sin(radianes);
    }

    // Función para calcular el coseno
    public static double calcularCoseno(double radianes) {
        return Math.cos(radianes);
    }

    // Función para calcular la tangente
    public static double calcularTangente(double radianes) {
        return Math.tan(radianes);
    }

    // Función para imprimir una fila de la tabla
    public static void imprimirFila(int grados, double seno, double coseno, double tangente) {
        System.out.printf("%-15d%-15.3f%-15.3f%-15.3f%n", grados, seno, coseno, tangente);
    }
}
