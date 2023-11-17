package Examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el colegio y agregar cursos
        Colegio colegio = new Colegio("Aprendizaje de POO", 2023);

        String[] nombres = {"Juan", "María", "Carlos", "Ana", "José", "Carmen", "Francisco", "Isabel", "Manuel", "Teresa", "Luis", "Patricia", "Antonio", "Laura", "Javier", "Beatriz", "Felipe", "Rosa"};
        String[] apellidos = {"Pérez", "Rodríguez", "Gómez", "López", "Martínez", "Torres", "García", "Ramírez", "González", "Morales", "Guzmán", "Castro", "Ruiz", "Ortega", "Vargas", "Paredes", "Mendoza", "Zúñiga"};

        // Agregar cursos hasta noveno grado con los nombres y apellidos proporcionados
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            Curso grado = new Curso("Grado " + i, colegio);

            Estudiante estudiante1 = new Estudiante(nombres[index], apellidos[index], "ID" + (index + 1), grado);
            index++;
            agregarCalificacionesAleatorias(estudiante1);

            Estudiante estudiante2 = new Estudiante(nombres[index], apellidos[index], "ID" + (index + 1), grado);
            index++;
            agregarCalificacionesAleatorias(estudiante2);

            grado.agregarEstudiante(estudiante1);
            grado.agregarEstudiante(estudiante2);

            colegio.agregarCurso(grado);
        }

        // Mostrar información del colegio
        colegio.mostrarInformacion();

        // Menú interactivo
        while (true) {
            System.out.println("\nSeleccione el grado (1-9):");
            List<Curso> cursos = colegio.getCursos();
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println((i + 1) + ". " + cursos.get(i).getNombre());
            }
        
            System.out.print("Ingrese el número del grado (0 para salir): ");
        
            // Validar la entrada del usuario
            int opcionGrado;
            try {
                opcionGrado = scanner.nextInt();
                if (opcionGrado < 0 || opcionGrado > 9) {
                    System.out.println("Por favor, ingrese un número válido entre 1 y 9.");
                    continue; // Reinicia el bucle
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar el búfer del escáner para evitar un bucle infinito
                continue; // Reinicia el bucle
            }
        
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

                    int opcionEstudiante = 0;

                    do {
                        System.out.print("Ingrese el número del estudiante: ");
                        try {
                            opcionEstudiante = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next(); // descarta la entrada incorrecta
                            continue;
                        }

                        if (opcionEstudiante < 1 || opcionEstudiante > estudiantes.size()) {
                            System.out.println("Número de estudiante inválido. Por favor, intente de nuevo.");
                        }
                    } while (opcionEstudiante < 1 || opcionEstudiante > estudiantes.size());

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

    // Método para agregar calificaciones aleatorias a un estudiante
    private static void agregarCalificacionesAleatorias(Estudiante estudiante) {
        estudiante.agregarCalificacion("Español", "Parcial 1", generarNotasAleatorias());
        estudiante.agregarCalificacion("Español", "Parcial 2", generarNotasAleatorias());
        estudiante.agregarCalificacion("Español", "Parcial 3", generarNotasAleatorias());
        estudiante.agregarCalificacion("Español", "Parcial 4", generarNotasAleatorias());

        estudiante.agregarCalificacion("Matemáticas", "Parcial 1", generarNotasAleatorias());
        estudiante.agregarCalificacion("Matemáticas", "Parcial 2", generarNotasAleatorias());
        estudiante.agregarCalificacion("Matemáticas", "Parcial 3", generarNotasAleatorias());
        estudiante.agregarCalificacion("Matemáticas", "Parcial 4", generarNotasAleatorias());

        estudiante.agregarCalificacion("Sociales", "Parcial 1", generarNotasAleatorias());
        estudiante.agregarCalificacion("Sociales", "Parcial 2", generarNotasAleatorias());
        estudiante.agregarCalificacion("Sociales", "Parcial 3", generarNotasAleatorias());
        estudiante.agregarCalificacion("Sociales", "Parcial 4", generarNotasAleatorias());

        estudiante.agregarCalificacion("Física", "Parcial 1", generarNotasAleatorias());
        estudiante.agregarCalificacion("Física", "Parcial 2", generarNotasAleatorias());
        estudiante.agregarCalificacion("Física", "Parcial 3", generarNotasAleatorias());
        estudiante.agregarCalificacion("Física", "Parcial 4", generarNotasAleatorias());

        estudiante.agregarCalificacion("Química", "Parcial 1", generarNotasAleatorias());
        estudiante.agregarCalificacion("Química", "Parcial 2", generarNotasAleatorias());
        estudiante.agregarCalificacion("Química", "Parcial 3", generarNotasAleatorias());
        estudiante.agregarCalificacion("Química", "Parcial 4", generarNotasAleatorias());
    }

    // Método para generar notas aleatorias (entre 0 y 100)
    private static List<Double> generarNotasAleatorias() {
        List<Double> notas = new ArrayList<>();
        double nota = Math.round(Math.random() * 100); // Genera una sola nota aleatoria
        notas.add(nota);
        return notas;
    }
}
