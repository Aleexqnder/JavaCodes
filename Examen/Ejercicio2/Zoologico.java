import java.util.ArrayList;
/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class Zoologico {
    private String nombre;
    private ArrayList<Area> areas;
    private ArrayList<Trabajador> trabajadores; 

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.areas = new ArrayList<>();
        this.trabajadores = new ArrayList<>();
    }

    public void generarReporte() {
        System.out.println("Reporte del Zoológico " + this.nombre);
        System.out.println("Número de áreas: " + this.areas.size());
        System.out.println("Número de trabajadores: " + this.trabajadores.size());
    
        // Detalles de áreas
        for (Area area : this.areas) {
            area.generarReporte();
        }
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public void addArea(Area area) {
        this.areas.add(area);
    }

    public void addTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }
}