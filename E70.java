/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java mejora el sistema de instrucción asistida por computadora.
# Ahora, cuenta el número de respuestas correctas e incorrectas del estudiante y, al alcanzar 10 respuestas,
# calcula el porcentaje de respuestas correctas. Si el porcentaje es menor del 75%, el programa imprime
# "Por favor pida ayuda adicional a su instructor y termina".
# ---------------------------------------------------------
*/

import java.util.Scanner;
import java.util.Random;

public class E70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (int i = 1; i <= 10; i++) {
            int numero1 = random.nextInt(10);
            int numero2 = random.nextInt(10);

            System.out.print("Pregunta " + i + ": ¿Cuánto es " + numero1 + " + " + numero2 + "? ");
            int respuesta = scanner.nextInt();

            if (respuesta == numero1 + numero2) {
                System.out.println("¡Correcto!\n");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + (numero1 + numero2) + ".\n");
                respuestasIncorrectas++;
            }
        }

        double porcentajeCorrectas = (respuestasCorrectas * 100.0) / 10;

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
        System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");

        // Verificar si el estudiante necesita ayuda adicional
        if (porcentajeCorrectas < 75) {
            System.out.println("Por favor, pida ayuda adicional a su instructor.");
        }

        scanner.close();
    }
}
