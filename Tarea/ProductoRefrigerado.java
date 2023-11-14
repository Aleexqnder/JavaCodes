public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private double temperaturaMantenimientoRecomendada;

    // Constructor sin argumentos
 // Constructor sin argumentos
    public ProductoRefrigerado() {
        super("FechaCaducidadPredeterminada", "NumeroLotePredeterminado");
        this.codigoOrganismo = "CodigoOrganismoNoEspecificado";
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
        System.out.println("Producto Refrigerado:");
        System.out.println();
        super.mostrarInformacion();
        System.out.println("Código del Organismo: " + codigoOrganismo);
        System.out.println("Temperatura de Mantenimiento Recomendada: " + temperaturaMantenimientoRecomendada);
        System.out.println();
    }
}
