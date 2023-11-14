public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    // Constructor sin argumentos
  // Constructor sin argumentos
    public ProductoFresco() {
        super("FechaCaducidadPredeterminada", "NumeroLotePredeterminado");
        this.fechaEnvasado = "FechaEnvasadoNoEspecificada";
        this.paisOrigen = "PaisOrigenNoEspecificado";
    }

    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Fresco:");
        System.out.println();
        super.mostrarInformacion();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
         System.out.println();
    }
}