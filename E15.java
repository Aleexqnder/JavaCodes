/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: E1
# Análisis/Resumen: Este programa en Java imprime un cuadro, un óvalo, una flecha y un diamante.
# Utiliza bucles anidados para dibujar las figuras en la consola.
# ---------------------------------------------------------
*/

public class E15 {
    public static void main(String[] args) {
        // Imprimir Cuadro
        System.out.println("Cuadro:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Imprimir Óvalo
        System.out.println("Óvalo:");
        System.out.println("  ***  ");
        for (int i = 0; i < 7; i++) {
            System.out.println("*     *");
        }
        System.out.println("  ***  ");

        // Imprimir Flecha
        System.out.println("Flecha:");
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        for (int i = 0; i < 6; i++) {
            System.out.println("    *");
        }

        // Imprimir Diamante
        System.out.println("Diamante:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j == 4 || i - j == 4 || j - i == 4 || i + j == 12) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
