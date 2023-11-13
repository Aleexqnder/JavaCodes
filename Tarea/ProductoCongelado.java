public class ProductoCongelado extends Producto {
    public double temperaturaMantenimientoRecomendada;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaMantenimientoRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
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
        System.out.println("Temperatura de mantenimiento recomendada: " + temperaturaMantenimientoRecomendada);
    }
}