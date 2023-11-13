public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAguaCongelacion;

    // Constructor sin argumentos
    public CongeladoPorAgua() {
        super("", "", 0.0); // Puedes poner valores predeterminados aquí si lo deseas
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
        super.mostrarInformacion();
        System.out.println("Salinidad del agua de congelación: " + salinidadAguaCongelacion);
    }
}