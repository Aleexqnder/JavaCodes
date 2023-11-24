/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java utiliza la librería Math para calcular y mostrar 
en forma tabular los valores de seno, coseno y tangente
# para los grados en el rango de 0 a 360. Cumple con las restricciones de construir una tabla 
con columnas de ancho 15, mostrar tres cifras
# decimales en los resultados y hacer una pausa cada 50 valores, mostrando los encabezados de las 
columnas después de cada pausa.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%-15s%-15s%-15s%-15s%n", "Grados", "Seno", "Coseno", "Tangente");

        for (int grados = 0; grados <= 360; grados++) {
            double radianes = Math.toRadians(grados);
            double seno = Math.sin(radianes);
            double coseno = Math.cos(radianes);
            double tangente = Math.tan(radianes);

            System.out.printf("%-15d%-15.3f%-15.3f%-15.3f%n", grados, seno, coseno, tangente);

            // Hacer una pausa cada 50 valores
            if (grados % 50 == 0 && grados != 0) {
                System.out.println("Presione cualquier tecla para continuar...");
                scanner.nextLine(); // Esperar a que el usuario presione enter
                System.out.printf("%-15s%-15s%-15s%-15s%n", "Grados", "Seno", "Coseno", "Tangente");
            }
        }

        scanner.close();
    }
}
