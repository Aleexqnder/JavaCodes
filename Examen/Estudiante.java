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
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Identidad: " + identidad);
        System.out.println("Curso: " + curso.getNombre());

        System.out.println("Calificaciones:");
        for (Map.Entry<String, Map<String, List<Double>>> entry : calificaciones.entrySet()) {
            String materia = entry.getKey();
            Map<String, List<Double>> parciales = entry.getValue();

            for (Map.Entry<String, List<Double>> parcialEntry : parciales.entrySet()) {
                String parcial = parcialEntry.getKey();
                List<Double> notas = parcialEntry.getValue();

                System.out.println("   - " + materia + ", " + parcial + ": " + notas);
            }
        }
    }
    
    // Getter y Setter para la propiedad 'curso'
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

