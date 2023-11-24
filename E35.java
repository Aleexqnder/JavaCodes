/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java imprime una tabla de los equivalentes binario, octal y hexadecimal
# de los números decimales en el rango de 1 a 256.
# ---------------------------------------------------------
*/

public class E35 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Decimal", "Binario", "Octal", "Hexadecimal");

        for (int decimal = 1; decimal <= 256; decimal++) {
            String binario = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            System.out.printf("%-10d%-10s%-10s%-10s\n", decimal, binario, octal, hexadecimal);
        }
    }
}
