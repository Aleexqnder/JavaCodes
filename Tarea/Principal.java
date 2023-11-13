import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        ProductoFresco fresco = new ProductoFresco();
        fresco.setFechaCaducidad("2022-12-31");
        fresco.setNumeroLote("L123");
        fresco.setFechaEnvasado("2022-01-01");
        fresco.setPaisOrigen("Spain");
        productos.add(fresco);

        ProductoRefrigerado refrigerado = new ProductoRefrigerado();
        refrigerado.setFechaCaducidad("2022-12-31");
        refrigerado.setNumeroLote("L124");
        refrigerado.setCodigoOrganismo("O123");
        refrigerado.setTemperaturaMantenimientoRecomendada(4);
        productos.add(refrigerado);

        CongeladoPorAire congeladoAire = new CongeladoPorAire();
        congeladoAire.setFechaCaducidad("2022-12-31");
        congeladoAire.setNumeroLote("L125");
        congeladoAire.setTemperaturaMantenimientoRecomendada(-18);
        congeladoAire.setComposicionAire("78% Nitrogen, 21% Oxygen, 1% Other gases");
        productos.add(congeladoAire);

        CongeladoPorAgua congeladoAgua = new CongeladoPorAgua();
        congeladoAgua.setFechaCaducidad("2022-12-31");
        congeladoAgua.setNumeroLote("L126");
        congeladoAgua.setTemperaturaMantenimientoRecomendada(-18);
        congeladoAgua.setSalinidadAguaCongelacion(3.5);
        productos.add(congeladoAgua);

        CongeladoPorNitrogeno congeladoNitrogeno = new CongeladoPorNitrogeno();
        congeladoNitrogeno.setFechaCaducidad("2022-12-31");
        congeladoNitrogeno.setNumeroLote("L127");
        congeladoNitrogeno.setTemperaturaMantenimientoRecomendada(-196);
        congeladoNitrogeno.setMetodoCongelacion("Immersion in liquid nitrogen");
        congeladoNitrogeno.setTiempoExposicionNitrogeno(30);
        productos.add(congeladoNitrogeno);

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
}