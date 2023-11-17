package Examen;

import java.util.List;
import java.util.ArrayList;

public class Colegio {
    private String nombreColegio;
    private int anioLectivo;
    private List<Curso> cursos;

    public Colegio(String nombreColegio, int anioLectivo) {
        this.nombreColegio = nombreColegio;
        this.anioLectivo = anioLectivo;
        this.cursos = new ArrayList<>();
    }

    public int getAnioLectivo() {
        return anioLectivo;
    }
    
    public String getNombre() {
        return nombreColegio;
    }
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("| Información del colegio: |");
        System.out.println("Colegio: " + nombreColegio);
        System.out.println("Año lectivo: " + anioLectivo);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
