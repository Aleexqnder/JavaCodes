import java.util.ArrayList;
/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class Trabajador {
    protected String nombre;
    protected ArrayList<Area> zonaDeTrabajo; 
    protected String especialidad;

    public Trabajador(String nombre, ArrayList<Area> zonaDeTrabajo, String especialidad) {
        this.nombre = nombre;
        this.zonaDeTrabajo = zonaDeTrabajo;
        this.especialidad = especialidad;
    }


    public ArrayList<Area> getZonaDeTrabajo() { 
        return zonaDeTrabajo;
    }

    public void setZonaDeTrabajo(ArrayList<Area> zonaDeTrabajo) { 
        this.zonaDeTrabajo = zonaDeTrabajo;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void generarReporte() {
        System.out.println("Nombre del trabajador: " + this.nombre);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Áreas de trabajo: ");
        for (Area area : this.zonaDeTrabajo) {
            area.generarReporte();
        }
    }
    

}