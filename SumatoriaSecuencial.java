import java.util.Scanner;
public class SumatoriaSecuencial {
    
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            /*Construir un programa que permita sumar la sucesión de los números 2^1+2^2...+2^n, n es un
            número ingresado por el usuario*/
            System.out.print("Ingrese el valor de n: ");
            int n = sc.nextInt();

            double suma = 0;

            for (int i = 1; i <= n; i++) {
                suma += Math.pow(2, i);
            }

            System.out.printf("La suma de la sucesión 2^1 + 2^2 + ... + 2^%d es: %.2f%n", n, suma);
        }
    }
}
