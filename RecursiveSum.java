import java.util.Scanner;
public class RecursiveSum {


    public static int sumUpTo(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sumUpTo(n-1);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada
        System.out.print("Por favor, ingrese un número: ");
        int number = scanner.nextInt();  // Lee el número ingresado por el usuario
        int result = sumUpTo(number);
        System.out.println("La suma de todos los números desde 1 hasta " + number + " es: " + result);
        
    }
    
    
}
