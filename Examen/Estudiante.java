package Examen;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String identidad;
    private Curso curso;
    private Map<String, Map<String, List<Double>>> calificaciones; // Materia -> Parcial -> Notas

    public Estudiante(String nombres, String apellidos, String identidad, Curso curso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identidad = identidad;
        this.curso = curso;
        this.calificaciones = new HashMap<>();
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void agregarCalificacion(String materia, String parcial, List<Double> notas) {
        // Verificar si la materia ya existe en el mapa de calificaciones
        if (!calificaciones.containsKey(materia)) {
            calificaciones.put(materia, new HashMap<>());
        }

        // Asignar las notas al parcial correspondiente
        calificaciones.get(materia).put(parcial, notas);
    }

    public void mostrarInformacion() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Identidad: " + identidad);

        // Obtener información del curso y colegio
        Curso curso = getCurso();
        Colegio colegio = curso.getColegio();

        System.out.println("Colegio: " + colegio.getNombre());
        System.out.println("Año Lectivo: " + colegio.getAnioLectivo());
        System.out.println("Curso: " + curso.getNombre());

        System.out.println("Calificaciones:");

        for (Map.Entry<String, Map<String, List<Double>>> entry : calificaciones.entrySet()) {
            String materia = entry.getKey();
            Map<String, List<Double>> parciales = entry.getValue();

            System.out.println(materia + ":");

            for (Map.Entry<String, List<Double>> parcialEntry : parciales.entrySet()) {
                String parcial = parcialEntry.getKey();
                List<Double> notas = parcialEntry.getValue();

                System.out.print(parcial + ": [");

                for (int i = 0; i < notas.size(); i++) {
                    System.out.print(notas.get(i));

                    if (i < notas.size() - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println("]");
            }

            double promedioMateria = calcularPromedioMateria(parciales);
            System.out.println("Promedio " + materia + ": " + promedioMateria);
        }
    }

    private double calcularPromedioMateria(Map<String, List<Double>> parciales) {
        double sum = 0;

        for (List<Double> notas : parciales.values()) {
            for (Double nota : notas) {
                sum += nota;
            }
        }

        int totalNotas = parciales.size() * parciales.values().iterator().next().size();
        return sum / totalNotas;
    }

    // Getter y Setter para la propiedad 'curso'
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}