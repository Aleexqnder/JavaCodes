public class Factorial {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Caso base
        } else {
            return n * factorial(n-1);  // Paso recursivo
        }
    }

    public static void main(String[] args) {
        // Prueba del método factorial
        int num = 5;
        System.out.println("Factorial de " + num + " es: " + factorial(num));
    }
}
