/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java solicita al usuario dos números enteros,
# los compara y muestra cuál es el mayor. Si ambos son iguales, indica que los números
# son iguales. Utiliza la clase Scanner para la entrada del usuario, estructuras de control
# if-else para la comparación y se asegura de cerrar el objeto Scanner al final para evitar
# posibles fugas de memoria.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor.");
        } else if (num2 > num1) {
            System.out.println("El número " + num2 + " es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        entrada.close();
    }
}
