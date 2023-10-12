import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese una cadena: ");
        String input = scanner.nextLine();  
        int vowelsCount = 0;  // Para contar las vocales
        int consonantsCount = 0;  // Para contar las consonantes
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i)); 
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelsCount++;
            } else if ((currentChar >= 'a' && currentChar <= 'z')) {
                consonantsCount++;
            }
        }
        System.out.println("Número de vocales: " + vowelsCount);
        System.out.println("Número de consonantes: " + consonantsCount);

    }
    
}
