/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Este programa en Java modifica la función de alineación para formar un
 cuadrado con cualquier carácter
# especificado en el parámetro caracterRelleno. El código incluye la función alinearCuadrado 
y un ejemplo de uso con un lado
# de 4 y el carácter "#" como relleno.
# ---------------------------------------------------------
*/

public class E60 {
    public static void main(String[] args) {
        // Ejemplo de uso
        alinearCuadrado(4, '#');
    }

    // Función para alinear un cuadrado con un carácter de relleno dado
    public static void alinearCuadrado(int lado, char caracterRelleno) {
        // Verificar que el lado sea mayor a 0
        if (lado <= 0) {
            System.out.println("El lado debe ser mayor a 0.");
            return;
        }

        // Imprimir el cuadrado
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(caracterRelleno + " ");
            }
            System.out.println();
        }
    }
}
