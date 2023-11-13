public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private double temperaturaMantenimientoRecomendada;

    // Constructor sin argumentos
    public ProductoRefrigerado() {
        super("", ""); // Puedes poner valores predeterminados aquí si lo deseas
        this.codigoOrganismo = "";
        this.temperaturaMantenimientoRecomendada = 0.0;
    }

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo, double temperaturaMantenimientoRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    public void setTemperaturaMantenimientoRecomendada(double temperaturaMantenimientoRecomendada) {
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código del organismo: " + codigoOrganismo);
        System.out.println("Temperatura de mantenimiento recomendada: " + temperaturaMantenimientoRecomendada);
    }
}