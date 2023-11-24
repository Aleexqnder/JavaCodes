/*
# ---------------------------------------------------------
# Nombre: Jasson Alexander Suazo Molina
# Correo electrónico: jasson.suazo@unah.hn
# Código: 20211020997
# Análisis/Resumen: Esta librería en Java, llamada ArchivoLib, proporciona una función para leer un archivo línea por línea
# y almacenar cada línea en un arreglo unidimensional de tipo String.
# ---------------------------------------------------------
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E85 {
    // Función para leer un archivo y almacenar cada línea en un arreglo de tipo String
    public static String[] leerArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            // Obtener la cantidad de líneas en el archivo
            long lineCount = br.lines().count();

            // Crear un arreglo de tipo String con el tamaño igual al número de líneas
            String[] lineas = new String[(int) lineCount];

            // Volver a abrir el archivo para leer las líneas y almacenarlas en el arreglo
            try (BufferedReader br2 = new BufferedReader(new FileReader(nombreArchivo))) {
                for (int i = 0; i < lineas.length; i++) {
                    lineas[i] = br2.readLine();
                }
            }

            return lineas;
        } catch (IOException e) {
            // Manejar la excepción en caso de error de lectura
            e.printStackTrace();
            return null;
        }
    }
}
