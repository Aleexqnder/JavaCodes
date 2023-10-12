import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 23, 45, 67, 89, 12, 78, 56, 34, 90};  // Array
        System.out.print("Ingrese un número para buscar: ");
        int searchNumber = scanner.nextInt();
        boolean isFound = false;  

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                isFound = true;
                System.out.println("El número " + searchNumber + " fue encontrado en el índice: " + i);
                break;  // 
            }
        }
        
        if (!isFound) {
            System.out.println("El número " + searchNumber + " no se encuentra en el array.");
        }
        
    }
}
