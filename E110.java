import java.util.Scanner;
import java.util.Random;

/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java solicita al usuario que ingrese un número mayor a 2 y menor a 15. Con ese número crea una matriz cuadrada
# y la llena con números positivos generados con una función. Luego, muestra la matriz original y su transpuesta utilizando funciones separadas.
# ---------------------------------------------------------
*/

public class E110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número mayor a 2 y menor a 15: ");
        int n = scanner.nextInt();

        if (n > 2 && n < 15) {
            int[][] matriz = crearMatrizCuadrada(n);
            llenarMatrizPositivos(matriz);

            System.out.println("\nMatriz Original:");
            mostrarMatriz(matriz);

            System.out.println("\nMatriz Transpuesta:");
            mostrarTranspuesta(matriz);
        } else {
            System.out.println("El número ingresado no cumple con los requisitos.");
        }

        scanner.close();
    }

    // Función para crear una matriz cuadrada
    private static int[][] crearMatrizCuadrada(int n) {
        return new int[n][n];
    }

    // Función para llenar una matriz con números positivos generados aleatoriamente
    private static void llenarMatrizPositivos(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números positivos entre 1 y 100
            }
        }
    }

    // Función para mostrar una matriz
    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    // Función para mostrar la transpuesta de una matriz
    private static void mostrarTranspuesta(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
