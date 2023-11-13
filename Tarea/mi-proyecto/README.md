# Mi-Proyecto

This is a Java project that models different types of products in a supermarket. The products are categorized into fresh, refrigerated, and frozen. The frozen products are further categorized into frozen by air, water, and nitrogen.

## Classes

The project contains the following classes:

- `Producto`: This is the base class for all products. It contains common attributes like `fechaCaducidad` and `numeroLote`.

- `ProductoFresco`: This class inherits from `Producto` and represents fresh products. It adds `fechaEnvasado` and `paisOrigen` attributes.

- `ProductoRefrigerado`: This class inherits from `Producto` and represents refrigerated products. It adds `codigoOrganismo` and `temperaturaMantenimientoRecomendada` attributes.

- `ProductoCongelado`: This class inherits from `Producto` and represents frozen products. It adds `temperaturaMantenimientoRecomendada` attribute.

- `CongeladoPorAire`: This class inherits from `ProductoCongelado` and represents products frozen by air. It adds `composicionAire` attribute.

- `CongeladoPorAgua`: This class inherits from `ProductoCongelado` and represents products frozen by water. It adds `salinidadAguaCongelacion` attribute.

- `CongeladoPorNitrogeno`: This class inherits from `ProductoCongelado` and represents products frozen by nitrogen. It adds `metodoCongelacion` and `tiempoExposicionNitrógeno` attributes.

- `Principal`: This class contains the `main` method where instances of the above classes are created and their information is displayed.

## How to Run

To run the project, navigate to the `src` directory and compile all the java files using the `javac` command. Then, run the `Principal` class using the `java` command.

## Author

[Alexander Suazo]

## Aleexqnder

This project is licensed under the Aleexqnder.