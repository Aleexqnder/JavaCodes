
import java.util.Scanner;

public class NumerPi {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        
        **

        *LONGITUD Y AREA DE UNA CIRCUNFERENCIA, VOLUMEN DE UNA ESFERA

        *	longitud = 2*pi*radio

        *	area = pi*radio^2

        *	volumen = pi*radio^3*3/4

        */

        //variables 

        double radio = 0, logitud = 0, area = 0, volumen = 0;

        int menu;

        System.out.println("Bienvenido");

        System.out.println("Por favor seleccione una opción: ");

        System.out.println("1. Longitud\n2. Area\n3. Volumen");

        System.out.print("=>");

        menu = leer.nextInt();

        System.out.println("Ingrese el radio para continuar");

        radio = leer.nextDouble();

        switch (menu) {

            case 1:

                logitud = 2*Math.PI*radio;                

                break;

            case 2:

                area = Math.PI*Math.pow(radio,2);

                break;

            case 3:

                volumen = Math.PI*Math.pow(radio,3)*(3/4);

                break;

            default:

                System.out.println("Opción no valida!!");

                break;

        }

        System.out.println("L: "+logitud);

        System.out.println("A: "+area);

        System.out.println("V: "+volumen);

    

    }

}