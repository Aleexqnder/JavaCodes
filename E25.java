/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java determina si tres enteros distintos de cero podrían 
ser los lados de un triángulo rectángulo.
# Utiliza el teorema de Pitágoras para verificar la propiedad del triángulo rectángulo y muestra el resultado.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer entero distinto de cero: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo entero distinto de cero: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingrese el tercer entero distinto de cero: ");
        int lado3 = scanner.nextInt();

        boolean esTrianguloRectangulo = esTrianguloRectangulo(lado1, lado2, lado3);

        if (esTrianguloRectangulo) {
            System.out.println("Estos lados podrían formar un triángulo rectángulo.");
        } else {
            System.out.println("Estos lados no podrían formar un triángulo rectángulo.");
        }

        scanner.close();
    }

    private static boolean esTrianguloRectangulo(int lado1, int lado2, int lado3) {
        int ladoMayor = Math.max(lado1, Math.max(lado2, lado3));
        int sumaCuadradosMenores = 0;

        if (ladoMayor == lado1) {
            sumaCuadradosMenores = lado2 * lado2 + lado3 * lado3;
        } else if (ladoMayor == lado2) {
            sumaCuadradosMenores = lado1 * lado1 + lado3 * lado3;
        } else {
            sumaCuadradosMenores = lado1 * lado1 + lado2 * lado2;
        }

        return ladoMayor * ladoMayor == sumaCuadradosMenores;
    }
}
