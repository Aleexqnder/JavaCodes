import java.util.Scanner;

public class SaleOfCaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PrecioGorra = 100.00;
        
        System.out.println("Venta de gorras a beneficio de la teleton");
        System.out.println("El valor de cada gorra es de L. 100");
        System.out.println("-----------------------------------------");
        System.out.println("        1 - 10 = Descuento 10%");
        System.out.println("        11 - 50 =  Descuento 15%");
        System.out.println("        51 - 100 =  Descuento 20%");
        System.out.println("        101- 500 = Descuento 25%");
        System.out.println("        501 en adelante =  Descuento 30%");
         System.out.println("-----------------------------------------");
        System.out.print("Ingrese la cantidad de gorras que desea comprar:");
        int cantidad = sc.nextInt();
        
        double descuento = 0;
        double total;

        int caso;
        // Categorizamos la cantidad en "casos"
        if (cantidad <= 10) caso = 1;
        else if (cantidad <= 50) caso = 2;
        else if (cantidad <= 100) caso = 3;
        else if (cantidad <= 500) caso = 4;
        else caso = 5;

        // Usamos switch para determinar el descuento basado en los "casos"
        switch (caso) {
            case 1:
                descuento = 0.10;
                break;
            case 2:
                descuento = 0.15;
                break;
            case 3:
                descuento = 0.20;
                break;
            case 4:
                descuento = 0.25;
                break;
            case 5:
                descuento = 0.30;
                break;
        }

        // Calcular el total con el descuento aplicado
        total = (PrecioGorra * cantidad) * (1 - descuento);

        System.out.printf("El total a pagar con el descuento aplicado es: L.%.2f%n", total);
    }
}
