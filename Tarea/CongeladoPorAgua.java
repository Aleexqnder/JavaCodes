public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAguaCongelacion;

    // Constructor sin argumentos
   // Constructor sin argumentos
public CongeladoPorAgua() {
    super("FechaCaducidadPredeterminada", "NumeroLotePredeterminado", 0.0);
    this.salinidadAguaCongelacion = 0.0;
}


    public CongeladoPorAgua(String fechaCaducidad, String numeroLote, double temperaturaMantenimientoRecomendada, double salinidadAguaCongelacion) {
        super(fechaCaducidad, numeroLote, temperaturaMantenimientoRecomendada);
        this.salinidadAguaCongelacion = salinidadAguaCongelacion;
    }

    public double getSalinidadAguaCongelacion() {
        return salinidadAguaCongelacion;
    }

    public void setSalinidadAguaCongelacion(double salinidadAguaCongelacion) {
        this.salinidadAguaCongelacion = salinidadAguaCongelacion;
    }

    public static void main(String[] args) {
        System.out.println("Congelado Por Agua:");
        CongeladoPorAgua productoCongeladoPorAgua = new CongeladoPorAgua();
        // establecer los atributos del producto
        productoCongeladoPorAgua.setFechaCaducidad("2022-12-31");
        productoCongeladoPorAgua.setNumeroLote("L123");
        productoCongeladoPorAgua.setSalinidadAguaCongelacion(0.9);
        // mostrar la información del producto
        productoCongeladoPorAgua.mostrarInformacion();
    }

}