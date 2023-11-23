/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java permite al usuario elegir entre diferentes 
figuras (círculo, cuadrado, triángulo, rectángulo y rombo),
# solicita la información necesaria para calcular el área y el perímetro de la figura
 seleccionada, y luego muestra la figura, las entradas del
# usuario y los resultados obtenidos. El código incluye ciclos y funciones para mejorar 
la modularidad y legibilidad.
# ---------------------------------------------------------
*/

import java.util.Scanner;

public class E50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones de figuras disponibles
        System.out.println("Seleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Rombo");

        // Solicitar al usuario elegir una figura
        System.out.print("Ingrese el número de la figura seleccionada: ");
        int opcion = scanner.nextInt();

        // Procesar la figura seleccionada
        switch (opcion) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 5:
                calcularRombo(scanner);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una figura válida.");
        }
    }


   // Función para calcular el área y el perímetro de un círculo
private static void calcularCirculo(Scanner scanner) {
    System.out.print("Ingrese el radio del círculo: ");
    double radio = scanner.nextDouble();

    // Calcular área y perímetro del círculo
    double area = Math.PI * Math.pow(radio, 2);
    double perimetro = 2 * Math.PI * radio;

    // Mostrar resultados
    System.out.println("\nFigura seleccionada: Círculo");
    System.out.println("Radio ingresado: " + radio);
    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
}

    // Función para calcular el área y el perímetro de un cuadrado
private static void calcularCuadrado(Scanner scanner) {
    System.out.print("Ingrese el lado del cuadrado: ");
    double lado = scanner.nextDouble();

    // Calcular área y perímetro del cuadrado
    double area = Math.pow(lado, 2);
    double perimetro = 4 * lado;

    // Mostrar resultados
    System.out.println("\nFigura seleccionada: Cuadrado");
    System.out.println("Lado ingresado: " + lado);
    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
}
    // Función para calcular el área y el perímetro de un triángulo
    private static void calcularTriangulo(Scanner scanner) {

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular área y perímetro del triángulo
        double area = 0.5 * base * altura;
        double perimetro = base * 3; // Cambiado de 2 a 3

        // Mostrar resultados
        System.out.println("\nFigura seleccionada: Triángulo");
        System.out.println("Base ingresada: " + base);
        System.out.println("Altura ingresada: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

   // Función para calcular el área y el perímetro de un rectángulo
    private static void calcularRectangulo(Scanner scanner) {
    System.out.print("Ingrese la base del rectángulo: ");
    double base = scanner.nextDouble();

    System.out.print("Ingrese la altura del rectángulo: ");
    double altura = scanner.nextDouble();

    // Calcular área y perímetro del rectángulo
    double area = base * altura;
    double perimetro = 2 * (base + altura);

    // Mostrar resultados
    System.out.println("\nFigura seleccionada: Rectángulo");
    System.out.println("Base ingresada: " + base);
    System.out.println("Altura ingresada: " + altura);
    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
}

    // Función para calcular el área y el perímetro de un rombo
    private static void calcularRombo(Scanner scanner) {
    System.out.print("Ingrese la diagonal mayor del rombo: ");
    double diagonalMayor = scanner.nextDouble();

    System.out.print("Ingrese la diagonal menor del rombo: ");
    double diagonalMenor = scanner.nextDouble();

    // Calcular área y perímetro del rombo
    double area = (diagonalMayor * diagonalMenor) / 2;
    double perimetro = 4 * Math.sqrt(Math.pow(diagonalMayor/2, 2) + Math.pow(diagonalMenor/2, 2));

    // Mostrar resultados
    System.out.println("\nFigura seleccionada: Rombo");
    System.out.println("Diagonal mayor ingresada: " + diagonalMayor);
    System.out.println("Diagonal menor ingresada: " + diagonalMenor);
    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
    }
}
