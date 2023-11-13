public class CongeladoPorAire extends ProductoCongelado {
    private String composicionAire;

    // Constructor sin argumentos
    public CongeladoPorAire() {
        super("", "", 0.0); // Puedes poner valores predeterminados aquí si lo deseas
        this.composicionAire = "";
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
        return "CongeladoPorAire{" +
                "composicionAire='" + composicionAire + '\'' +
                ", fechaCaducidad='" + getFechaCaducidad() + '\'' +
                ", numeroLote='" + getNumeroLote() + '\'' +
                ", temperaturaMantenimientoRecomendada=" + getTemperaturaMantenimientoRecomendada() +
                '}';
    }
}