/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java implementa un juego de dados en el que el usuario comienza con un crédito de L. 1000.00.
# El usuario realiza apuestas y tiene que adivinar la suma de dos dados lanzados. El programa muestra los dados, calcula la suma, 
# dibuja los dados y proporciona retroalimentación sobre si el usuario ha ganado o perdido. El juego continúa hasta que el usuario
# se queda sin dinero o decide retirarse después de al menos cinco jugadas sin perder todo su dinero.
# ---------------------------------------------------------
*/

import java.util.Scanner;
import java.util.Random;

public class E55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double credito = 1000.00;
        int jugadas = 0;

        System.out.println("¡Bienvenido al juego de dados!");

        while (credito > 0 && (jugadas < 5 || deseaContinuar(scanner))) {
            // Solicitar apuesta al usuario
            double apuesta = solicitarApuesta(scanner, credito);

            // Lanzar los dados
            int dado1 = lanzarDado(random);
            int dado2 = lanzarDado(random);

            // Calcular la suma de los dados
            int sumaDados = dado1 + dado2;

            // Dibujar los dados
            dibujarDados(dado1, dado2);

            // Verificar resultado y actualizar crédito
            credito = verificarResultado(apuesta, credito, sumaDados);

            // Mostrar crédito actual
            System.out.println("Crédito actual: L. " + credito);

            // Incrementar contador de jugadas
            jugadas++;
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }

    private static double solicitarApuesta(Scanner scanner, double credito) {
        double apuesta;

        // Solicitar apuesta al usuario
        do {
            System.out.print("Ingrese su apuesta (entre 1 y " + credito + "): ");
            apuesta = scanner.nextDouble();
        } while (apuesta < 1 || apuesta > credito);

        return apuesta;
    }

    private static int lanzarDado(Random random) {
        // Generar un número aleatorio entre 1 y 6 (simulando un dado)
        return random.nextInt(6) + 1;
    }

    private static void dibujarDados(int dado1, int dado2) {
        // Dibujar el primer dado
        System.out.println("Dado 1:");
        dibujarCaraDado(dado1);

        // Dibujar el segundo dado
        System.out.println("Dado 2:");
        dibujarCaraDado(dado2);
    }

    private static void dibujarCaraDado(int valor) {
        switch (valor) {
            case 1:
                System.out.println("   ");
                System.out.println(" O ");
                System.out.println("   ");
                break;
            case 2:
                System.out.println("  O");
                System.out.println("   ");
                System.out.println("O  ");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" O ");
                System.out.println("O  ");
                break;
            case 4:
                System.out.println("O O");
                System.out.println("   ");
                System.out.println("O O");
                break;
            case 5:
                System.out.println("O O");
                System.out.println(" O ");
                System.out.println("O O");
                break;
            case 6:
                System.out.println("O O");
                System.out.println("O O");
                System.out.println("O O");
                break;
            default:
                System.out.println("Valor de dado no válido.");
        }
    }

    private static double verificarResultado(double apuesta, double credito, int sumaDados) {
        // Retroalimentación sobre el resultado
        System.out.println("Suma de los dados: " + sumaDados);
        if (apuesta == sumaDados) {
            double ganancia = apuesta + (apuesta / 2);
            credito += ganancia;
            System.out.println("¡Felicidades! Has ganado L. " + ganancia);
        } else {
            credito -= apuesta;
            System.out.println("Lo siento, has perdido L. " + apuesta);
        }

        return credito;
    }

    private static boolean deseaContinuar(Scanner scanner) {
        // Preguntar al usuario si desea continuar
        System.out.print("¿Desea continuar jugando? (1: Sí, 0: No): ");
        return scanner.nextInt() == 1;
    }
}
