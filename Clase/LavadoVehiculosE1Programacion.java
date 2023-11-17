/* Un pequeño negocio de lavado de vehículos que opera de lunes a domingo requiere de su experiencia en el 
desarrollo de sistemas de información, han expresado la necesidad de un pequeño programa que sea capaz de 
registrar clientes frecuentes los cuales suelen ser 5 diarios, quienes acumulan insignias cada vez que visitan el 
negocio esto como parte de su campaña semanal publicitaria. El gerente necesita que el programa pueda registrar
el nombre del cliente, identidad y la insignia (cantidad de estrellas obtenidas). 
El negocio ofrece tres servicios
1. lavado general
2. lavado y aspirado
3. lavado, encerado de pintura y pulida de focos

cuyas insignias por ganar pueden ser respectivamente por cada servicio 
(Servicio 1 y 2: 1/2 estrella, Servicio 3: 1 estrella).
Considerando que cada cliente puede obtener un solo servicio diario, el programa deberá permitir registrar la 
información de los clientes (nombre e identidad) de forma manual y la cantidad de estrellas acumuladas podrán 
generarse aleatoria y manualmente, además el programa deberá finalizar cuando el usuario lo indique, una vez se 
disponga del escenario previo haga lo siguiente:

1. Muestre todos los clientes con sus estrellas acumuladas
2. Cuál de los clientes acumulo más estrellas.
a. Si el número de estrellas acumuladas por un cliente es igual o mayor que 5 el programa debe 

indicarle que ha ganado un servicio gratis.
Construya los métodos correspondientes a cada acción lógica según su análisis, así mismo; apóyese en arreglos 
multidimensionales para la gestión de información.

NOTA: Coloque la clase del ejercicio en una carpeta (recuerde el archivo fuente debe ser .java), comprímala y 
súbala al espacio en el campus correspondiente a la Prueba N. */

/*Prueba N1
 20211020997
 Jasson Alexander Suazo Molina
 1300 */


import java.util.*;

public class LavadoVehiculosE1Programacion {

    static Scanner scanner = new Scanner(System.in);
    static final int CLIENTES = 5;
    static final String[] DIAS = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    static int diaActual = 0;
    static String[][] informacionClientes = new String[CLIENTES][4]; // Agrego una columna extra para manejar el estado del cliente (si ya fue seleccionado)
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nDía: " + DIAS[diaActual]);
            if (diaActual == 0) {
                mostrarMenuPrincipal();
            } else {
                mostrarMenuDias();
            }
        }
    }
    
    public static void mostrarMenuPrincipal() {
         System.out.println("-----------------------------------------------------------");
        System.out.println("\nMenú:");
        System.out.println("1. Registrar clientes");
        System.out.println("2. Mostrar clientes y estrellas");
        System.out.println("3. Cliente con más estrellas");
        System.out.println("4. Salir");
        System.out.println("-----------------------------------------------------------");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        switch (opcion) {
            case 1:
                registrarClientes();
                diaActual++;
                break;
            case 2:
                mostrarClientes();
                break;
            case 3:
                clienteConMasEstrellas();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    public static void mostrarMenuDias() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nMenú:");
        System.out.println("1. Seleccionar cliente agregado");
        System.out.println("2. Mostrar clientes y estrellas");
        System.out.println("3. Cliente con más estrellas");
        System.out.println("4. Salir");
        System.out.println("-----------------------------------------------------------");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        switch (opcion) {
            case 1:
                seleccionarCliente();
                break;
            case 2:
                mostrarClientes();
                break;
            case 3:
                clienteConMasEstrellas();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    public static void registrarClientes() {
        for (int i = 0; i < CLIENTES; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            informacionClientes[i][0] = scanner.nextLine();
            System.out.print("Identidad: ");
            informacionClientes[i][1] = scanner.nextLine();
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nTipo de servicio \n1. Lavado general, \n2. Lavado y aspirado, \n3. Lavado especial:");
            System.out.println("-----------------------------------------------------------");
            int servicio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            double estrellas = 0;
            switch (servicio) {
                case 1:
                case 2:
                    estrellas = 0.5;
                    break;
                case 3:
                    estrellas = 1;
                    break;
            }
            informacionClientes[i][2] = String.valueOf(estrellas);
            informacionClientes[i][3] = "no seleccionado"; // Estado inicial del cliente
        }
    }

    public static void seleccionarCliente() {
        int opcion;
        do {
              System.out.println("-----------------------------------------------------------");
            System.out.println("Selecciona un cliente:");
            for (int i = 0; i < CLIENTES; i++) {
                if (informacionClientes[i][3].equals("no seleccionado")) {
                    System.out.println((i + 1) + ". " + informacionClientes[i][0]);
                      System.out.println("-----------------------------------------------------------");
                }
            }
            opcion = scanner.nextInt();
            if (opcion < 1 || opcion > CLIENTES || informacionClientes[opcion - 1][3].equals("seleccionado")) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }
            actualizarEstrellas(opcion - 1);
            informacionClientes[opcion - 1][3] = "seleccionado";  // Marcar al cliente como seleccionado
    
            // Verificar si todos los clientes han sido seleccionados
            int clientesSeleccionados = 0;
            for (int i = 0; i < CLIENTES; i++) {
                if (informacionClientes[i][3].equals("seleccionado")) {
                    clientesSeleccionados++;
                }
            }
            if (clientesSeleccionados == CLIENTES) {
                diaActual++;
                if (diaActual >= DIAS.length) {
                    diaActual = 0; // reiniciar a lunes si supera el domingo
                }
                for (int i = 0; i < CLIENTES; i++) {
                    informacionClientes[i][3] = "no seleccionado"; // Reiniciar el estado de selección de los clientes
                }
            }
    
            break;
        } while (true);
    }
    

    public static void actualizarEstrellas(int indiceCliente) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nTipo de servicio \n1. Lavado general, \n2. Lavado y aspirado, \n3. Lavado especial:");
        System.out.println("-----------------------------------------------------------");
        int servicio = scanner.nextInt();
        double estrellasActuales = Double.parseDouble(informacionClientes[indiceCliente][2]);
        switch (servicio) {
            case 1:
            case 2:
                estrellasActuales += 0.5;
                break;
            case 3:
                estrellasActuales += 1;
                break;
        }
        informacionClientes[indiceCliente][2] = String.valueOf(estrellasActuales);
    }

    public static void mostrarClientes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Clientes y estrellas acumuladas:");
        System.out.println("-----------------------------------------------------------");
        for (int dia = 0; dia <= diaActual; dia++) {
            System.out.println("Día: " + DIAS[dia]);
            System.out.println("Nombre      |       Identidad         |             Estrellas");
            for (int i = 0; i < CLIENTES; i++) {
                System.out.println(informacionClientes[i][0] + " | " + informacionClientes[i][1] + " | " + informacionClientes[i][2] + " estrellas.");
            }
            System.out.println();  // Espacio entre los días
        }
    }
    
    public static void clienteConMasEstrellas() {
        String nombreMax = "";
        double maxEstrellas = -1;
        String diaMax = "";
    
        for (int dia = 0; dia <= diaActual; dia++) {
            for (int i = 0; i < CLIENTES; i++) {
                double estrellas = Double.parseDouble(informacionClientes[i][2]);

                if (estrellas > maxEstrellas) {
                    maxEstrellas = estrellas;
                    nombreMax = informacionClientes[i][0];
                    diaMax = DIAS[dia];
                }
            }
        }
      System.out.println("-----------------------------------------------------------");
      System.out.println("Cliente con más estrellas: " + nombreMax + " con " + maxEstrellas);
       System.out.println("-----------------------------------------------------------");
    
        if (maxEstrellas >= 5) {
            System.out.println("-----------------------------------------------------------");
            System.out.println(nombreMax + " Ha ganado un servicio gratis.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    
}