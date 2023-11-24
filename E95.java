import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java solicita al usuario un número entre 10 y 100. Luego, crea un vector con esa cantidad de números aleatorios,
# los presenta tal como se crearon, los ordena y los presenta ordenados de mayor a menor.
# ---------------------------------------------------------
*/

public class E95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 10 y 100
        int cantidadNumeros = solicitarNumero(scanner);

        // Crear un vector con números aleatorios
        int[] numeros = generarNumerosAleatorios(cantidadNumeros);

        // Presentar el vector tal como se creó
        System.out.println("\nVector creado:");
        imprimirVector(numeros);

        // Ordenar el vector
        Arrays.sort(numeros);

        // Presentar el vector ordenado de mayor a menor
        System.out.println("\nVector ordenado de mayor a menor:");
        imprimirVectorInvertido(numeros);

        scanner.close();
    }

    // Función para solicitar al usuario un número entre 10 y 100
    private static int solicitarNumero(Scanner scanner) {
        int numero;
        do {
            System.out.print("Ingrese un número entre 10 y 100: ");
            numero = scanner.nextInt();
        } while (numero < 10 || numero > 100);
        return numero;
    }

    // Función para generar un vector con números aleatorios
    private static int[] generarNumerosAleatorios(int cantidad) {
        int[] numeros = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(1000); // Puedes ajustar el rango según tus necesidades
        }

        return numeros;
    }

    // Función para imprimir un vector
    private static void imprimirVector(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    // Función para imprimir un vector en orden invertido (de mayor a menor)
    private static void imprimirVectorInvertido(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
