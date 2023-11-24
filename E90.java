/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java permite al usuario ingresar cinco números, asegurándose de que no se ingresen valores repetidos.
# Luego, muestra los números ingresados. Se utiliza una función para verificar la repetición de números durante la entrada.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5]; // Cambia el tamaño del arreglo según tus necesidades

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            int numero = leerNumero(scanner, numeros, i);
            numeros[i] = numero;
        }

        System.out.println("\nNúmeros ingresados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }

    // Función para leer un número y verificar que no esté repetido en el arreglo
    private static int leerNumero(Scanner scanner, int[] numeros, int index) {
        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (!existeNumeroEnArreglo(numero, numeros, index)) {
                return numero;
            } else {
                System.out.println("¡Número repetido! Ingrese otro número.");
            }
        }
    }

    // Función para verificar si un número ya existe en un arreglo hasta cierto índice
    private static boolean existeNumeroEnArreglo(int numero, int[] numeros, int endIndex) {
        for (int i = 0; i < endIndex; i++) {
            if (numeros[i] == numero) {
                return true; // El número ya existe en el arreglo
            }
        }
        return false; // El número no existe en el arreglo
    }
}
