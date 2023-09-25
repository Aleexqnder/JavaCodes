import java.util.Scanner;

public class pharmacy2 {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     /*E5: Una farmacia desea un programa para que al ingresar el valor de compra pueda calcular lo siguiente: 
        si el pago se efectúa al “contado” o en efectivo, calcular un descuento del 15%; pero si el pago es con
        “tarjeta” se incrementa un recargo del 8% al valor de compra. Calcular y 
        visualizar el descuento o recargo según sea el caso y el total a pagar de la compra. */
   
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
