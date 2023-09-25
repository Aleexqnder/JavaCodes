import java.util.Scanner;

public class Login {

    // Declarar constantes para el nombre de usuario y contraseña
    private static final String UsernameCorrect = "usuario";
    private static final String PasswordCorrect = "pepito123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Realizar un programa que simule un inicio de sesión solicitando 
        el nombre de usuario y contraseña (declare variables constantes), y mostrar un mensaje en pantalla,
        inicio de sesión correcto/ nombre de usuario incorrecto. */
        String usernameIngresado, contraseñaIngresada;

        do {
            // Solicitar al usuario ingresar su nombre de usuario y contraseña
            System.out.print("Ingrese su nombre de usuario: ");
            usernameIngresado = sc.nextLine();

            System.out.print("Ingrese su contraseña: ");
            contraseñaIngresada = sc.nextLine();

            // Verificar si el inicio de sesión fue incorrecto
            if (!UsernameCorrect.equals(usernameIngresado) || !PasswordCorrect.equals(contraseñaIngresada)) {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, intente de nuevo.");
            }

        } while (!UsernameCorrect.equals(usernameIngresado) || !PasswordCorrect.equals(contraseñaIngresada));

        System.out.println("Inicio de sesión correcto.");
    }
}
