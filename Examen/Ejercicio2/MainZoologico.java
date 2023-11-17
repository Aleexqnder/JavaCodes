import java.util.ArrayList;
/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class MainZoologico {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico("Mi Zoológico");

        // Agregar áreas al zoológico
        Area area1 = new Area("Selva", "A001", 500);
        zoologico.addArea(area1);

        // Agregar instalaciones al área
        Instalacion instalacion1 = new Instalacion("Jaula Leones", "I001", 2020, "Metal");
        area1.agregarInstalacion(instalacion1);

        // Agregar animales a la instalación
        Animal leon1 = new Animal("León", "Simba", 2015, "L001");
        instalacion1.agregarAnimal(leon1);

        // Agregar veterinarios al zoológico
        ArrayList<Area> areasVeterinario = new ArrayList<>();
        areasVeterinario.add(area1);
        Veterinario veterinario1 = new Veterinario("Dr. Felino", areasVeterinario, "Felinos y Primates");
        zoologico.addTrabajador(veterinario1);

        // Realizar chequeo veterinario
        veterinario1.realizarChequeo(leon1);

        ArrayList<Area> areasJardinero = new ArrayList<>();
        areasJardinero.add(area1);
        Jardinero jardinero1 = new Jardinero("Sr. Jardín", areasJardinero, "Jardinería");
        zoologico.addTrabajador(jardinero1);
        
        // Mostrar reporte actualizado
        zoologico.generarReporte();
    }
}