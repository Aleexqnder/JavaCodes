import java.util.Scanner;

/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java utiliza el algoritmo de ordenamiento de burbuja para ordenar un arreglo de 10 enteros
# ingresados por el usuario. El programa realiza varias pasadas a través del arreglo, comparando y intercambiando elementos según sea necesario.
# ---------------------------------------------------------
*/

public class E100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = new int[10];

        // Solicitar al usuario ingresar los 10 elementos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Aplicar el ordenamiento de burbuja
        ordenamientoBurbuja(arreglo);

        // Mostrar el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);

        scanner.close();
    }

    // Función para aplicar el ordenamiento de burbuja
    private static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar elementos adyacentes
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si están en orden descendente
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Función para imprimir un arreglo
    private static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
