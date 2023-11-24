/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen:
   Este programa en Java simula la gestión de habitaciones en el hospital general de Latveria.
   Se utilizan matrices tridimensionales para representar las habitaciones asignadas a cuatro especialidades
   en tres pisos. El programa ofrece opciones para consultar habitaciones libres, asignar y liberar habitaciones,
   y mostrar tablas detalladas de ocupación. Utiliza funciones modulares y estructuras de control para una
   interacción clara con el usuario. Además, se proporcionan funciones adicionales para mejorar la claridad
   y modularidad del código, como la obtención del ordinal y la visualización de las especialidades.
# ---------------------------------------------------------
*/
import java.util.Scanner;

public class E115 {
    static final int NUM_ESPECIALIDADES = 4;
    static final int NUM_PISOS = 3;
    static final int NUM_HABITACIONES = 10;

    static String[][][] hospital = new String[NUM_ESPECIALIDADES][NUM_PISOS][NUM_HABITACIONES];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarHabitacionesLibresPorEspecialidad();
                    break;
                case 2:
                    consultarHabitacionesPorPiso();
                    break;
                case 3:
                    asignarHabitacion();
                    break;
                case 4:
                    liberarHabitacion();
                    break;
                case 5:
                    mostrarTablaHabitacionesOcupadas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Salud Latveria ---");
        System.out.println("1. Consultar habitaciones libres por especialidad");
        System.out.println("2. Consultar habitaciones por piso");
        System.out.println("3. Asignar habitación");
        System.out.println("4. Liberar habitación");
        System.out.println("5. Mostrar tabla de habitaciones ocupadas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void consultarHabitacionesLibresPorEspecialidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Consultar habitaciones libres por especialidad ---");
        mostrarEspecialidades();

        System.out.print("Seleccione una especialidad: ");
        int especialidad = scanner.nextInt() - 1;

        if (especialidad >= 0 && especialidad < NUM_ESPECIALIDADES) {
            for (int piso = 0; piso < NUM_PISOS; piso++) {
                System.out.println("Piso " + obtenerOrdinal(piso + 2) + ": ");
                mostrarHabitacionesLibres(hospital[especialidad][piso]);
            }
        } else {
            System.out.println("Especialidad no válida. Intente nuevamente.");
        }
    }

    private static void consultarHabitacionesPorPiso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Consultar habitaciones por piso ---");
        mostrarEspecialidades();

        System.out.print("Seleccione una especialidad: ");
        int especialidad = scanner.nextInt() - 1;

        if (especialidad >= 0 && especialidad < NUM_ESPECIALIDADES) {
            System.out.print("Seleccione un piso (2-4): ");
            int piso = scanner.nextInt();

            if (piso >= 2 && piso <= 4) {
                System.out.println("Piso " + obtenerOrdinal(piso) + ": ");
                mostrarHabitaciones(hospital[especialidad][piso - 2]);
            } else {
                System.out.println("Piso no válido. Intente nuevamente.");
            }
        } else {
            System.out.println("Especialidad no válida. Intente nuevamente.");
        }
    }

    private static void asignarHabitacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Asignar habitación ---");
        mostrarEspecialidades();

        System.out.print("Seleccione una especialidad: ");
        int especialidad = scanner.nextInt() - 1;

        if (especialidad >= 0 && especialidad < NUM_ESPECIALIDADES) {
            System.out.print("Seleccione un piso (2-4): ");
            int piso = scanner.nextInt();

            if (piso >= 2 && piso <= 4) {
                System.out.print("Seleccione una habitación (1-10): ");
                int habitacion = scanner.nextInt();

                if (habitacion >= 1 && habitacion <= 10) {
                    if (hospital[especialidad][piso - 2][habitacion - 1] == null) {
                        System.out.print("Ingrese el número de expediente del paciente: ");
                        int expediente = scanner.nextInt();

                        hospital[especialidad][piso - 2][habitacion - 1] = Integer.toString(expediente);
                        System.out.println("Habitación asignada con éxito.");
                    } else {
                        System.out.println("La habitación ya está ocupada. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Habitación no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Piso no válido. Intente nuevamente.");
            }
        } else {
            System.out.println("Especialidad no válida. Intente nuevamente.");
        }
    }

    private static void liberarHabitacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Liberar habitación ---");
        mostrarEspecialidades();

        System.out.print("Seleccione una especialidad: ");
        int especialidad = scanner.nextInt() - 1;

        if (especialidad >= 0 && especialidad < NUM_ESPECIALIDADES) {
            System.out.print("Seleccione un piso (2-4): ");
            int piso = scanner.nextInt();

            if (piso >= 2 && piso <= 4) {
                System.out.print("Seleccione una habitación (1-10): ");
                int habitacion = scanner.nextInt();

                if (habitacion >= 1 && habitacion <= 10) {
                    if (hospital[especialidad][piso - 2][habitacion - 1] != null) {
                        hospital[especialidad][piso - 2][habitacion - 1] = null;
                        System.out.println("Habitación liberada con éxito.");
                    } else {
                        System.out.println("La habitación ya está libre. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Habitación no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Piso no válido. Intente nuevamente.");
            }
        } else {
            System.out.println("Especialidad no válida. Intente nuevamente.");
        }
    }

    private static void mostrarTablaHabitacionesOcupadas() {
        System.out.println("\n--- Tabla de habitaciones ocupadas ---");
        System.out.println("Especialidad | Piso | Habitación | Paciente");
        for (int especialidad = 0; especialidad < NUM_ESPECIALIDADES; especialidad++) {
            for (int piso = 0; piso < NUM_PISOS; piso++) {
                mostrarHabitacionesOcupadas(hospital[especialidad][piso], especialidad + 1, piso + 2);
            }
        }
    }

    private static void mostrarEspecialidades() {
        System.out.println("Especialidades:");
        System.out.println("1. Cirugía general");
        System.out.println("2. Ginecología y obstetricia");
        System.out.println("3. Medicina interna");
        System.out.println("4. Nefrología");
    }

       private static void mostrarHabitacionesLibres(String[] piso) {
        for (int i = 0; i < NUM_HABITACIONES; i++) {
            if (piso[i] == null) {
                System.out.println("Habitación " + (i + 1) + ": Libre");
            } else {
                System.out.println("Habitación " + (i + 1) + ": Ocupada");
            }
        }
    }

    private static void mostrarHabitaciones(String[] piso) {
        for (int i = 0; i < NUM_HABITACIONES; i++) {
            if (piso[i] == null) {
                System.out.println("Habitación " + (i + 1) + ": Libre");
            } else {
                System.out.println("Habitación " + (i + 1) + ": Ocupada por Paciente " + piso[i]);
            }
        }
    }

    private static void mostrarHabitacionesOcupadas(String[] piso, int especialidad, int pisoNumero) {
        for (int i = 0; i < NUM_HABITACIONES; i++) {
            if (piso[i] != null) {
                System.out.println(especialidad + " | Piso " + obtenerOrdinal(pisoNumero) + " | Habitación " + (i + 1) + " | Paciente " + piso[i]);
            }
        }
    }

    private static String obtenerOrdinal(int numero) {
        switch (numero) {
            case 1:
                return numero + "er";
            case 2:
                return numero + "do";
            case 3:
                return numero + "er";
            default:
                return numero + "to";
        }
    }
}