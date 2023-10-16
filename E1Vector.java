/*Prueba N°1
 * Número de cuenta: 20211020997
 * Nombre: Jasson Alexander Suazo Molina
 * Sección 1300
*/
 import java.util.Scanner;
 import java.util.Random;
public class E1Vector {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        

        int n, IndiceNombre, IndiceApellido, LetrasNombre, LetrasApellido;
        String NombreCompleto;
        //Solicitar el limite del vector 1.
        do {
         System.out.println("El vector 1 tiene como Límite no reconocer un número menor o igual que 20");
         System.out.println("Se llenará aleatoriamente con números entre 15 y 50.");
         System.out.print("Introduzca un límite para el vector 1: ");
         n = scanner.nextInt();
         
         while (n <= 20){
             System.out.print("El numero debe ser mayor que 20: ");
             n = scanner.nextInt();
         }

         //Llenar el vector 1 con número decimales entre 15 y 50.
         String [] vector1 = new String [n];
         for (int i = 0; i < n; i++){
             vector1 [i] = String.valueOf(15+ random.nextDouble() * 35);
         }

         // Crear el vector 2
         scanner.nextLine();
         System.out.print("Introduzca su nombre completo: ");
         NombreCompleto = scanner.nextLine().replace(" ", "@");
         char[] vector2 = NombreCompleto.toCharArray();  

         //Cuenta las letras del nombre y del apellido
         String[] partes = NombreCompleto.split("@");
         LetrasNombre = partes[0].length();
         LetrasApellido = partes[1].length();
         
         
         /*Cuente las letras que tiene su nombre y apellido por 
         separado y verifique si se genero esa cantidad en 
         el vector 1.
         */
         
            IndiceNombre = -1; IndiceApellido = -1;
             for (int i = 0; i < n; i++){
                 double valor = Double.parseDouble(vector1[i]);
                 if (Math.round(valor)== LetrasNombre){
                     IndiceNombre = i;
                 }
                 if (Math.round(valor)== LetrasApellido){
                     IndiceApellido = i;
                 }
             }

             //Imprimir los vectores
             System.out.println("Vector 1:");
             System.out.print("[ ");
             for (int i = 0; i < vector1.length; i++) {
                 System.out.print(vector1[i]);
                 if (i < vector1.length - 1) {
                     System.out.print(", ");
                 }
             }
             System.out.println(" ]");
             
             System.out.println("\nVector 2:");
             System.out.print("[ ");
             for (int i = 0; i < vector2.length; i++) {
                 System.out.print(vector2[i]);
                 if (i < vector2.length - 1) {
                     System.out.print(", ");
                 }
             }
             System.out.println(" ]");
             
             // Preguntar al usuario si desea finalizar
             System.out.print("\n¿Desea volver a utilizar el programa? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("Y"));

        
    }         

}