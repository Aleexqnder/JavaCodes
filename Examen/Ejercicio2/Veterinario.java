/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
import java.util.ArrayList;
public class Veterinario extends Trabajador {
    // Atributos específicos para Veterinario
    private String especialidad;

    // Constructor
    public Veterinario(String nombre, ArrayList<Area> zonaDeTrabajo, String especialidad) {
        super(nombre, zonaDeTrabajo, especialidad);
        this.especialidad = especialidad;
    }

    // Métodos específicos para Veterinario
    public void realizarChequeo(Animal animal) {
        // Implementación del chequeo
    }

    public void administrarMedicamento(Animal animal, String medicamento) {
        // Implementación de la administración de medicamentos
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
