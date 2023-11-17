package Examen.Ejercicio1;
/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private List<Estudiante> estudiantes;
    private Colegio colegio; 

    public Curso(String nombreCurso, Colegio colegio) { 
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

    public Colegio getColegio() { 
        return colegio;
    }
}