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
        System.out.println("Producto Congelado:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Numero de Lote: " + getNumeroLote());
        System.out.println("Temperatura de Mantenimiento Recomendada: " + temperaturaMantenimientoRecomendada);
        System.out.println("Composición del Aire: 78% Nitrogen, 21% Oxygen, 1% Other gases");
        System.out.println();
    }
}