package Examen;

import java.util.List;
import java.util.ArrayList;

public class Colegio {
    private String nombreColegio;
    private int añoLectivo;
    private List<Curso> cursos;

    public Colegio(String nombreColegio, int añoLectivo) {
        this.nombreColegio = nombreColegio;
        this.añoLectivo = añoLectivo;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("| Información del colegio: |");
        System.out.println("Colegio: " + nombreColegio);
        System.out.println("Año lectivo: " + añoLectivo);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
