/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java modifica el cálculo de cargos por estacionamiento
 para cada cliente en un estacionamiento.
# El programa permite ingresar las horas de estacionamiento para tres clientes, calcula los cargos
 según las reglas especificadas y muestra
# los resultados en un formato tabular. Se ha agregado el uso de funciones y se ha realizado una pequeña
 modificación en la impresión
# para mejorar la presentación de los resultados.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducir las horas de estacionamiento para cada cliente
        double horasCliente1 = ingresarHoras(scanner, "primer");
        double horasCliente2 = ingresarHoras(scanner, "segundo");
        double horasCliente3 = ingresarHoras(scanner, "tercer");

        // Calcular cargos y mostrar resultados en formato tabular
        mostrarResultados(horasCliente1, horasCliente2, horasCliente3);

        scanner.close();
    }

    // Función para ingresar las horas de estacionamiento para un cliente
    public static double ingresarHoras(Scanner scanner, String numeroCliente) {
        System.out.print("Ingrese las horas de estacionamiento para el " + numeroCliente + " cliente: ");
        return scanner.nextDouble();
    }

    // Función para calcular los cargos por estacionamiento
    public static double calcularCargos(double horas) {
        double cargoMinimo = 2.00;
        double cargoPorHora = 0.50;
        double cargoMaximo = 10.00;
        double totalCargos = 0.0;

        // Calcular cargos para hasta tres horas
        if (horas <= 3) {
            totalCargos = cargoMinimo;
        } else {
            // Calcular cargos para más de tres horas
            totalCargos = cargoMinimo + (Math.ceil(horas - 3) * cargoPorHora);

            // Limitar el cargo máximo a $10.00
            if (totalCargos > cargoMaximo) {
                totalCargos = cargoMaximo;
            }
        }

        return totalCargos;
    }

    // Función para mostrar los resultados en formato tabular
    public static void mostrarResultados(double horasCliente1, double horasCliente2, double horasCliente3) {
        System.out.println("\nCliente\tHoras\tCargo");
        mostrarFila(1, horasCliente1);
        mostrarFila(2, horasCliente2);
        mostrarFila(3, horasCliente3);

        // Calcular y mostrar el total de los recibos
        double totalRecibos = calcularCargos(horasCliente1) + calcularCargos(horasCliente2) + calcularCargos(horasCliente3);
        System.out.println("\nTotal\t\t$" + totalRecibos);
    }

    // Función para mostrar una fila de resultados
    public static void mostrarFila(int numeroCliente, double horasCliente) {
        System.out.printf("%-8d%-7.2f$%-7.2f%n", numeroCliente, horasCliente, calcularCargos(horasCliente));
    }
}
