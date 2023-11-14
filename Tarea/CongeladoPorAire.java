public class CongeladoPorAire extends ProductoCongelado {
    private String composicionAire;

    // Constructor sin argumentos
// Constructor sin argumentos
    public CongeladoPorAire() {
        super("FechaCaducidadPredeterminada", "NumeroLotePredeterminado", -18.0);
        this.composicionAire = "ComposicionAireNoEspecificada";
    }

    public CongeladoPorAire(String fechaCaducidad, String numeroLote, double temperaturaMantenimientoRecomendada, String composicionAire) {
        super(fechaCaducidad, numeroLote, temperaturaMantenimientoRecomendada);
        this.composicionAire = composicionAire;
    }
    public String getComposicionAire() {
        return composicionAire;
    }

    public void setComposicionAire(String composicionAire) {
        this.composicionAire = composicionAire;
    }

    @Override
    public String toString() {
        return "Congelado Por Aire:\n\n" +
               "CongeladoPorAire{" +
               "composicionAire='" + composicionAire + '\'' +
               ", fechaCaducidad='" + getFechaCaducidad() + '\'' +
               ", numeroLote='" + getNumeroLote() + '\'' +
               ", temperaturaMantenimientoRecomendada=" + getTemperaturaMantenimientoRecomendada() +
               "}\n";
    }
}