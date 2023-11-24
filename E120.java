/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: [Tu Correo]
# Código: 20211020997
# Análisis/Resumen:
# Este programa en Java implementa un sistema de gestión para una clínica de nutrición.
# Utiliza estructuras de datos como clases y arreglos para almacenar información sobre los pacientes,
# expedientes de pago, consultas y estadísticas financieras.
# El programa ofrece un menú con diversas opciones:
# 1. Crear expediente de paciente: Permite registrar a un nuevo paciente con su nombre, sexo y diagnóstico.
# 2. Mostrar expediente de paciente: Muestra la información del expediente de un paciente, incluyendo monto pagado y pendiente.
# 3. Realizar consulta: Permite registrar una nueva consulta para un paciente, incluyendo fecha, valor y monto pagado.
# 4. Abonar a deuda: Permite que un paciente abone a su deuda, actualizando los montos pagados y pendientes.
# 5. Mostrar estadísticas: Muestra estadísticas financieras, ordenando a los pacientes por deuda pendiente de mayor a menor.
# 6. Salir: Cierra el programa.
# El código utiliza estructuras de control como bucles y condicionales para gestionar la lógica del programa.
# Además, se emplean funciones y procedimientos para modularizar el código y mejorar la legibilidad.
# ---------------------------------------------------------
*/

import java.util.Scanner;

class Fecha {
    int agno;
    int mes;
    int dia;
}

class Consulta {
    Fecha fechaConsulta;
    double valorConsulta;
    double montoPagado;
}

class ExpedientePago {
    int expediente;
    Consulta[] consultas = new Consulta[100];
    double montoPagado;
    double pendiente;
}

class Paciente {
    int expediente;
    String nombre;
    char sexo;
    String diagnostico;
    ExpedientePago expedientePago = new ExpedientePago();
}

public class E120 {
    static Scanner scanner = new Scanner(System.in);
    static Paciente[] pacientes = new Paciente[100];
    static int totalPacientes = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearExpediente();
                    break;
                case 2:
                    mostrarExpediente();
                    break;
                case 3:
                    realizarConsulta();
                    break;
                case 4:
                    abonarDeuda();
                    break;
                case 5:
                    mostrarEstadisticas();
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 6);
    }

    static void mostrarMenu() {
        System.out.println("\n*** Menú Principal ***");
        System.out.println("1. Crear expediente de paciente");
        System.out.println("2. Mostrar expediente de paciente");
        System.out.println("3. Realizar consulta");
        System.out.println("4. Abonar a deuda");
        System.out.println("5. Mostrar estadísticas");
        System.out.println("6. Salir");
    }

    static void crearExpediente() {
        Paciente paciente = new Paciente();
        paciente.expediente = ++totalPacientes;

        System.out.print("Ingrese el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingrese el sexo del paciente (M/F): ");
        paciente.sexo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el diagnóstico del paciente: ");
        paciente.diagnostico = scanner.nextLine();

        // Inicializar expediente de pago
        paciente.expedientePago.expediente = paciente.expediente;
        paciente.expedientePago.montoPagado = 0.0;
        paciente.expedientePago.pendiente = 0.0;

        pacientes[totalPacientes - 1] = paciente;

        System.out.println("Expediente creado exitosamente.");
    }

    static void mostrarExpediente() {
        System.out.print("Ingrese el número de expediente del paciente: ");
        int numeroExpediente = scanner.nextInt();

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.expediente == numeroExpediente) {
                System.out.println("\n*** Expediente del Paciente ***");
                System.out.println("Expediente: " + paciente.expediente);
                System.out.println("Nombre: " + paciente.nombre);
                System.out.println("Sexo: " + paciente.sexo);
                System.out.println("Diagnóstico: " + paciente.diagnostico);
                System.out.println("Monto pagado: " + paciente.expedientePago.montoPagado);
                System.out.println("Pendiente: " + paciente.expedientePago.pendiente);
                return;
            }
        }

        System.out.println("No se encontró un paciente con ese número de expediente.");
    }

    static void realizarConsulta() {
        System.out.print("Ingrese el número de expediente del paciente: ");
        int numeroExpediente = scanner.nextInt();

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.expediente == numeroExpediente) {
                // Obtener fecha de la consulta
                Fecha fechaConsulta = new Fecha();
                System.out.println("Ingrese la fecha de la consulta:");
                System.out.print("Año: ");
                fechaConsulta.agno = scanner.nextInt();
                System.out.print("Mes: ");
                fechaConsulta.mes = scanner.nextInt();
                System.out.print("Día: ");
                fechaConsulta.dia = scanner.nextInt();

                // Obtener valor de la consulta
                System.out.print("Ingrese el valor de la consulta: ");
                double valorConsulta = scanner.nextDouble();

                // Obtener monto pagado
                System.out.print("¿Cuánto pagó el paciente? (0 si no pagó): ");
                double montoPagado = scanner.nextDouble();

                // Crear nueva consulta
                Consulta nuevaConsulta = new Consulta();
                nuevaConsulta.fechaConsulta = fechaConsulta;
                nuevaConsulta.valorConsulta = valorConsulta;
                nuevaConsulta.montoPagado = montoPagado;

                // Actualizar expediente de pago del paciente
                paciente.expedientePago.consultas[paciente.expedientePago.expediente] = nuevaConsulta;
                paciente.expedientePago.montoPagado += montoPagado;
                paciente.expedientePago.pendiente += (valorConsulta - montoPagado);

                System.out.println("Consulta registrada exitosamente.");
                return;
            }
        }

        System.out.println("No se encontró un paciente con ese número de expediente.");
    }

    static void abonarDeuda() {
        System.out.print("Ingrese el número de expediente del paciente: ");
        int numeroExpediente = scanner.nextInt();

        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.expediente == numeroExpediente) {
                // Obtener monto a abonar
                System.out.print("¿Cuánto desea abonar a la deuda? ");
                double abono = scanner.nextDouble();

                // Verificar que el abono no sea mayor que la deuda pendiente
                if (abono > paciente.expedientePago.pendiente) {
                    System.out.println("El abono es mayor que la deuda pendiente. Abonando toda la deuda.");
                    abono = paciente.expedientePago.pendiente;
                }

                // Actualizar expediente de pago del paciente
                paciente.expedientePago.montoPagado += abono;
                paciente.expedientePago.pendiente -= abono;

                System.out.println("Abono registrado exitosamente.");
                return;
            }
        }

        System.out.println("No se encontró un paciente con ese número de expediente.");
    }

    static void mostrarEstadisticas() {
        // Ordenar pacientes por deuda pendiente de mayor a menor
        for (int i = 0; i < totalPacientes - 1; i++) {
            for (int j = 0; j < totalPacientes - i - 1; j++) {
                if (pacientes[j].expedientePago.pendiente < pacientes[j + 1].expedientePago.pendiente) {
                    // Intercambiar pacientes
                    Paciente temp = pacientes[j];
                    pacientes[j] = pacientes[j + 1];
                    pacientes[j + 1] = temp;
                }
            }
        }

        // Mostrar estadísticas
        System.out.println("\n*** Estadísticas ***");
        System.out.printf("%-20s%-20s%-20s\n", "Nombre", "Deuda Pendiente", "Número de Expediente");
        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.expediente != 0) {
                System.out.printf("%-20s%-20.2f%-20d\n", paciente.nombre, paciente.expedientePago.pendiente, paciente.expediente);
            }
        }
    }
}