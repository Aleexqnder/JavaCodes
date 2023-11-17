package Examen;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private List<Estudiante> estudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombreCurso;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
