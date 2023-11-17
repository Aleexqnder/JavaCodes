import java.util.ArrayList;
/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class Instalacion {
    private String nombre;
    private String identificador;
    private int añoInstalacion;
    private String materialConstruccion;
    private ArrayList<Animal> animales;

    public Instalacion(String nombre, String identificador, int añoInstalacion, String materialConstruccion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.añoInstalacion = añoInstalacion;
        this.materialConstruccion = materialConstruccion;
        this.animales = new ArrayList<>();
    }

    public Instalacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public void generarReporte() {
        System.out.println("Nombre de la instalación: " + this.nombre);
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Año de instalación: " + this.añoInstalacion);
        System.out.println("Material de construcción: " + this.materialConstruccion);
        System.out.println("Animales en la instalación: ");
        for (Animal animal : this.animales) {
            animal.generarReporte();
        }
    }
} 