/*Prueba N2 – POO
 20211020997
Jasson Alexander Suazo Molina
 1300 */
public class Animal {
    private String especie;
    private String nombre;
    private int añoNacimiento;
    private String identificadorAlfanumerico;

    public Animal(String especie, String nombre, int añoNacimiento, String identificadorAlfanumerico) {
        this.especie = especie;
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.identificadorAlfanumerico = identificadorAlfanumerico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getIdentificadorAlfanumerico() {
        return identificadorAlfanumerico;
    }

    public void setIdentificadorAlfanumerico(String identificadorAlfanumerico) {
        this.identificadorAlfanumerico = identificadorAlfanumerico;
    }

    public void generarReporte() {
        System.out.println("Especie: " + this.especie);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Año de nacimiento: " + this.añoNacimiento);
        System.out.println("Identificador alfanumérico: " + this.identificadorAlfanumerico);
    }
    
}