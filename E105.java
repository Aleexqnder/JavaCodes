import java.util.Random;
import java.util.Scanner;

/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java permite realizar diversas operaciones en matrices, dependiendo de si es cuadrada o no.
# Si la matriz es cuadrada, se inicializa en cero, se rellena con números aleatorios, y se realizan operaciones como imprimir la matriz completa,
# imprimir la diagonal principal, imprimir la diagonal secundaria, imprimir elementos que no pertenecen a las diagonales, imprimir elementos 
# arriba y debajo de la diagonal principal. Si la matriz no es cuadrada, se inicializa en cero, se rellena con números aleatorios,
# se imprime la matriz completa, se calculan y muestran los totales por fila y por columna, y se muestra el total de números pares e impares.
# ---------------------------------------------------------
*/

public class E105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas (mayor a 2 y menor o igual a 10): ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de columnas (mayor a 2 y menor o igual a 10): ");
        int columnas = scanner.nextInt();

        if (esCuadrada(filas, columnas)) {
            int[][] matrizCuadrada = new int[filas][columnas];

            inicializarMatrizEnCero(matrizCuadrada);
            rellenarMatrizAleatoria(matrizCuadrada);
            
            System.out.println("Matriz completa:");
            imprimirMatriz(matrizCuadrada);

            System.out.println("\nDiagonal principal:");
            imprimirDiagonalPrincipal(matrizCuadrada);

            System.out.println("\nDiagonal secundaria:");
            imprimirDiagonalSecundaria(matrizCuadrada);

            System.out.println("\nElementos fuera de las diagonales:");
            imprimirElementosFueraDeDiagonales(matrizCuadrada);

            System.out.println("\nElementos arriba de la diagonal principal:");
            imprimirElementosArribaDeDiagonalPrincipal(matrizCuadrada);

            System.out.println("\nElementos debajo de la diagonal principal:");
            imprimirElementosDebajoDeDiagonalPrincipal(matrizCuadrada);
        } else {
            int[][] matrizNoCuadrada = new int[filas][columnas];

            inicializarMatrizEnCero(matrizNoCuadrada);
            rellenarMatrizAleatoriaMayorQueUno(matrizNoCuadrada);

            System.out.println("Matriz completa:");
            imprimirMatriz(matrizNoCuadrada);

            int[] totalesPorFila = calcularTotalesPorFila(matrizNoCuadrada);
            int[] totalesPorColumna = calcularTotalesPorColumna(matrizNoCuadrada);

            System.out.println("\nMatriz con totales por fila y por columna:");
            imprimirMatrizConTotales(matrizNoCuadrada, totalesPorFila, totalesPorColumna);

            System.out.println("\nTotal de números pares: " + contarNumerosPares(matrizNoCuadrada));
            System.out.println("Total de números impares: " + contarNumerosImpares(matrizNoCuadrada));
        }

        scanner.close();
    }

    // Función para verificar si la matriz es cuadrada
    private static boolean esCuadrada(int filas, int columnas) {
        return filas == columnas && filas > 2 && filas <= 10;
    }

    // Función para inicializar una matriz en cero
    private static void inicializarMatrizEnCero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    // Función para rellenar una matriz con números aleatorios menores a 100
    private static void rellenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    // Función para rellenar una matriz con números aleatorios mayores que 1
    private static void rellenarMatrizAleatoriaMayorQueUno(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(99) + 2;
            }
        }
    }

    // Función para imprimir una matriz completa
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    // Función para imprimir la diagonal principal de una matriz
    private static void imprimirDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Función para imprimir la diagonal secundaria de una matriz
    private static void imprimirDiagonalSecundaria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Función para imprimir los elementos que no pertenecen a las diagonales de una matriz
    private static void imprimirElementosFueraDeDiagonales(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && i + j != matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Función para imprimir los elementos arriba de la diagonal principal de una matriz
    private static void imprimirElementosArribaDeDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Función para imprimir los elementos debajo de la diagonal principal de una matriz
    private static void imprimirElementosDebajoDeDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Función para calcular los totales por fila de una matriz no cuadrada
    private static int[] calcularTotalesPorFila(int[][] matriz) {
        int[] totalesPorFila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalesPorFila[i] += matriz[i][j];
            }
        }

        return totalesPorFila;
    }

    // Función para calcular los totales por columna de una matriz no cuadrada
    private static int[] calcularTotalesPorColumna(int[][] matriz) {
        int[] totalesPorColumna = new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalesPorColumna[j] += matriz[i][j];
            }
        }

        return totalesPorColumna;
    }

    // Función para imprimir una matriz con totales por fila y por columna
    private static void imprimirMatrizConTotales(int[][] matriz, int[] totalesPorFila, int[] totalesPorColumna) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\tTotal Fila: " + totalesPorFila[i]);
        }

        for (int total : totalesPorColumna) {
            System.out.print(total + "\t");
        }
        System.out.println("\tTotales Columna");
    }

    // Función para contar el total de números pares en una matriz no cuadrada
    private static int contarNumerosPares(int[][] matriz) {
        int totalPares = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento % 2 == 0) {
                    totalPares++;
                }
            }
        }

        return totalPares;
    }

    // Función para contar el total de números impares en una matriz no cuadrada
    private static int contarNumerosImpares(int[][] matriz) {
        int totalImpares = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento % 2 != 0) {
                    totalImpares++;
                }
            }
        }

        return totalImpares;
    }
}
