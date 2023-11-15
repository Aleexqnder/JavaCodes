package Ejercicios;

public class E15 {
    public static void main(String[] args) {
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

        System.out.println("Óvalo:");
        System.out.println("  ***  ");
        for (int i = 0; i < 7; i++) {
            System.out.println("*     *");
        }
        System.out.println("  ***  ");

        System.out.println("Flecha:");
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        for (int i = 0; i < 6; i++) {
            System.out.println("    *");
        }

        System.out.println("Diamante:");
        System.out.println("         *");
        System.out.println("        * *");
        System.out.println("       *   *");
        System.out.println("      *     *");
        System.out.println("     *       *");
        System.out.println("    *         *");
        System.out.println("   *           *");
        System.out.println("  *             *");
        System.out.println(" *               *");
        System.out.println("*                 *");
        System.out.println(" *               *");
        System.out.println("  *             *");
        System.out.println("   *           *");
        System.out.println("    *         *");
        System.out.println("     *       *");
        System.out.println("      *     *");
        System.out.println("       *   *");
        System.out.println("        * *");
        System.out.println("         *");
    }
}