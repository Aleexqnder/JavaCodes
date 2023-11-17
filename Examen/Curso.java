package Examen;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private List<Estudiante> estudiantes;
    private Colegio colegio; // nuevo campo

    public Curso(String nombreCurso, Colegio colegio) { // modificado para aceptar un colegio
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
        this.colegio = colegio; // asignar el colegio
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String anioLectivo() {
        return nombreCurso;
    }
    
    
    public String getNombre() {
        return nombreCurso;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Colegio getColegio() { // nuevo método
        return colegio;
    }
}