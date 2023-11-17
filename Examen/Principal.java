package Examen;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el colegio y agregar cursos
        Colegio colegio = new Colegio("POO", 2023);

        String[] nombres = {"Juan", "María", "Carlos", "Ana", "José", "Carmen", "Francisco", "Isabel", "Manuel", "Teresa", "Luis", "Patricia", "Antonio", "Laura", "Javier", "Beatriz", "Felipe", "Rosa"};
        String[] apellidos = {"Pérez", "Rodríguez", "Gómez", "López", "Martínez", "Torres", "García", "Ramírez", "González", "Morales", "Guzmán", "Castro", "Ruiz", "Ortega", "Vargas", "Paredes", "Mendoza", "Zúñiga"};

        // Agregar cursos hasta noveno grado con los nombres y apellidos proporcionados
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            Curso grado = new Curso("Grado " + i);

            Estudiante estudiante1 = new Estudiante(nombres[index], apellidos[index], "ID" + (index + 1), grado);
            index++;

            Estudiante estudiante2 = new Estudiante(nombres[index], apellidos[index], "ID" + (index + 1), grado);
            index++;

            grado.agregarEstudiante(estudiante1);
            grado.agregarEstudiante(estudiante2);

            colegio.agregarCurso(grado);
        }

        // Mostrar información del colegio
        colegio.mostrarInformacion();

        // Menú interactivo
        while (true) {
            System.out.println("\nSeleccione el grado:");
            List<Curso> cursos = colegio.getCursos();
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println((i + 1) + ". " + cursos.get(i).getNombre());
            }

            System.out.print("Ingrese el número del grado (0 para salir): ");
            int opcionGrado = scanner.nextInt();

            if (opcionGrado == 0) {
                break;
            }

            Curso cursoSeleccionado = cursos.get(opcionGrado - 1);

            if (cursoSeleccionado != null) {
                System.out.println("\nEstudiantes en " + cursoSeleccionado.getNombre() + ":");

                List<Estudiante> estudiantes = cursoSeleccionado.getEstudiantes();
                if (estudiantes != null) {
                    for (int i = 0; i < estudiantes.size(); i++) {
                        Estudiante estudiante = estudiantes.get(i);
                        if (estudiante != null) {
                            System.out.println((i + 1) + ". " + estudiante.getNombres() + " " + estudiante.getApellidos());
                        }
                    }

                    System.out.print("Ingrese el número del estudiante: ");
                    int opcionEstudiante = scanner.nextInt();

                    Estudiante estudianteSeleccionado = estudiantes.get(opcionEstudiante - 1);
                    if (estudianteSeleccionado != null) {
                        // Mostrar información de calificaciones
                        estudianteSeleccionado.mostrarInformacion();
                    } else {
                        System.out.println("El estudiante seleccionado es nulo.");
                    }
                } else {
                    System.out.println("No hay estudiantes en este curso.");
                }
            } else {
                System.out.println("El curso seleccionado es nulo.");
            }
        } // Fin del while
        System.out.println("Programa finalizado.");
    } // Fin del método main
} // Fin de la clase Principal
