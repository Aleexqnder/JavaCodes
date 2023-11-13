public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private double tiempoExposicionNitrogeno;

    // Constructor sin argumentos
    public CongeladoPorNitrogeno() {
        super("", "", 0.0); // Puedes poner valores predeterminados aquí si lo deseas
        this.metodoCongelacion = "";
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
        super.mostrarInformacion();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición al nitrógeno: " + tiempoExposicionNitrogeno);
    }
}