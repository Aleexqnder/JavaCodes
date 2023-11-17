/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class Area {
    private String nombre;
    private String identificador;
    private double metrosCuadrados;
    private Instalacion[] instalaciones;

    public Area(String nombre, String identificador, double metrosCuadrados) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.metrosCuadrados = metrosCuadrados;
        this.instalaciones = new Instalacion[10]; 
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarInstalacion(Instalacion instalacion) {
        for (int i = 0; i < this.instalaciones.length; i++) {
            if (this.instalaciones[i] == null) {
                this.instalaciones[i] = instalacion;
                break;
            }
        }
    }

    public void generarReporte() {
        System.out.println("Nombre del área: " + this.nombre);
        System.out.println("Identificador del área: " + this.identificador);
        System.out.println("Metros cuadrados del área: " + this.metrosCuadrados);
        System.out.println("Instalaciones en el área: ");
        for (Instalacion instalacion : this.instalaciones) {
            if (instalacion != null) {
                instalacion.generarReporte();
            }
        }
    }
    

}
