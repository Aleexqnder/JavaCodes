import java.util.Scanner;

public class pharmacy2 {
    public static void main (String args[]){
     try (Scanner sc = new Scanner(System.in)) {
        double ValorDePago;
        int Opcion = 0;
        double Descuento = 0;
        double TotalPago = 0;
        double Recargo = 0;

        System.out.println("Hola, bienvenido a Pharmacy2!");
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("|Una farmacia confiable y eficiente|");
        System.out.println("-----------------------------------");
    
        System.out.print("Ingrese el valor de la compra:");
        ValorDePago = sc.nextDouble();

    do {  
       
        System.out.println("Ingrese la forma de pago:");
        System.out.println("-------------------------");
        System.out.println("|      1. Contado       |");
        System.out.println("|      2. Tarjeta       |");
        System.out.println("-------------------------");
        Opcion = sc.nextInt();

         if (Opcion == 1 ){
            Descuento = ValorDePago * 0.15;
            TotalPago = ValorDePago - Descuento;
            System.out.println("Descuento aplicado: L." + Descuento);
         }else if (Opcion == 2){
             Recargo = ValorDePago * 0.08;
            TotalPago = ValorDePago + Recargo;
                System.out.println("Recargo aplicado: L." + Recargo);
         }else {
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }while (Opcion != 1 && Opcion !=2);
 
    System.out.println("Total a pagar: L." + TotalPago);
    }
}
  
    
}
