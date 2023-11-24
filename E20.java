/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java calcula los ingresos de los vendedores de una empresa química.
# Utiliza un bucle while para recibir las ventas brutas de cada vendedor, calcula los ingresos basados
# en el sueldo base más el 9% de las ventas brutas, y muestra los ingresos del vendedor.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';

        while (Character.toUpperCase(continuar) == 'S') {
            System.out.print("Ingrese las ventas brutas del vendedor: $");
            double ventasBrutas = scanner.nextDouble();

            double sueldoBase = 200.0;
            double ingresos = sueldoBase + (0.09 * ventasBrutas);

            System.out.println("Ingresos del vendedor: $" + ingresos);

            System.out.print("¿Desea ingresar las ventas de otro vendedor? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
