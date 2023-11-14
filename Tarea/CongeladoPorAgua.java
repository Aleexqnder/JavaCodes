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

    @Override
    public void mostrarInformacion() {
        System.out.println("Congelado Por Agua");
        System.out.println();
        super.mostrarInformacion();
        System.out.println("Salinidad del agua de congelación: " + salinidadAguaCongelacion);
        System.out.println();   
    }

}