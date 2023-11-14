public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private double tiempoExposicionNitrogeno;

    // Constructor sin argumentos
public CongeladoPorNitrogeno() {
    super("FechaCaducidadPredeterminada", "NumeroLotePredeterminado", -196.0);
    this.metodoCongelacion = "MetodoCongelacionNoEspecificado";
    this.tiempoExposicionNitrogeno = 0.0;

    }

    public CongeladoPorNitrogeno(String fechaCaducidad, String numeroLote, double temperaturaMantenimientoRecomendada, String metodoCongelacion, double tiempoExposicionNitrogeno) {
        super(fechaCaducidad, numeroLote, temperaturaMantenimientoRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(double tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Congelado Por Nitrógeno:");
        System.out.println();
        super.mostrarInformacion();
        System.out.println("Método de Congelación: " + metodoCongelacion);
        System.out.println("Tiempo de Exposición al Nitrógeno: " + tiempoExposicionNitrogeno);
        System.out.println();
    }
}
