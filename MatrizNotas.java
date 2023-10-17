import java.util.*;

public class MatrizNotas {
 
    static Scanner scanner = new Scanner(System.in);
    static final int Estudiantes = 5;
    static final int Clases = 4;
    static String [][] matriz = new String [Estudiantes + 1][Clases + 1];

    public static void main (String[] args){
        int opcion;
        do{
            System.out.println("Menú");
            System.out.println("1.Llenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1: LlenarMatriz(); break;
                case 2: MostrarMatriz(); break;
            }
        }while (opcion !=3);
    }

        public static void LlenarMatriz(){
            System.out.println("¿Desea inicializar la matriz manualmente? (1 = Sí, 2 = No.)");
            int respuesta = scanner.nextInt();

            if (respuesta == 1) {
                for (int i = 0; i < Estudiantes; i++){
                    System.out.println("Introduzca el nombre del estudiante: " + (i  + 1) + ":");
                    matriz[i][0] = scanner.nextLine();
                    for (int j = 1; j <= Clases; j++){
                        System.out.println("Introduzca la nota " + j + " del estudiante" + (i + 1) + ":");
                        matriz [i][j] = scanner.nextLine();
                    }
                }

                //Nombres de clases
                matriz[Estudiantes][0] = "Nombre Clase";
                for (int j = 1; j <= Clases; j++){
                    System.out.print("Introduce el nombre de la clase " + j + ": ");
                    matriz[Estudiantes][j] = scanner.nextLine();

                }
            } else if (respuesta == 2) {
               // Ejemplo de inicialización
            matriz = new String[][] {
                {"Nombre1", "80", "85", "90", "95"},
                {"Nombre2", "82", "86", "91", "92"},
                {"Nombre3", "84", "87", "93", "94"},
                {"Nombre4", "86", "88", "94", "96"},
                {"Nombre5", "88", "89", "95", "97"},
                {"Nombre Clase", "Lenguaje I", "Lenguaje II", "Lenguaje III", "Lenguaje IV"}
            };
        }    
    }


    public static void MostrarMatriz(){
        // Mostrar la matriz
        for (int i = 0; i < Estudiantes; i++) {
            for (int j = 0; j <= Clases; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
        // Calcular y mostrar promedios, nota mayor y menor
        double sumaEstudiante, sumaClase, mayor = -1, menor = 101, promedioClase;
        int repeticionesNota, maxRepeticionesNota = -1, notaMasRepetida = -1, claseNotaRepetida = -1;
        for (int i = 0; i < Estudiantes; i++) {
            sumaEstudiante = 0;
            for (int j = 1; j <= Clases; j++) {
                sumaEstudiante += Double.parseDouble(matriz[i][j]);
                if (Double.parseDouble(matriz[i][j]) > mayor) {
                    mayor = Double.parseDouble(matriz[i][j]);
                }
                if (Double.parseDouble(matriz[i][j]) < menor) {
                    menor = Double.parseDouble(matriz[i][j]);
                }
            }
            System.out.println("Promedio del estudiante " + matriz[i][0] + ": " + (sumaEstudiante / Clases));
        }
        for (int j = 1; j <= Clases; j++) {
            sumaClase = 0;
            repeticionesNota = 0;
            for (int i = 0; i < Estudiantes; i++) {
                sumaClase += Double.parseDouble(matriz[i][j]);
                for (int k = 0; k < Estudiantes; k++) {
                    if (matriz[i][j].equals(matriz[k][j])) {
                        repeticionesNota++;
                    }
                }
                if (repeticionesNota > maxRepeticionesNota) {
                    maxRepeticionesNota = repeticionesNota;
                    notaMasRepetida = Integer.parseInt(matriz[i][j]);
                    claseNotaRepetida = j;
                }
                repeticionesNota = 0;
            }
            promedioClase = sumaClase / Estudiantes;
            System.out.println("Promedio de la clase " + matriz[Estudiantes][j] + ": " + promedioClase);
        }

        System.out.println("La nota más alta es: " + mayor);
        System.out.println("La nota más baja es: " + menor);
        System.out.println("La nota que más se repite es: " + notaMasRepetida + " en la clase " + matriz[Estudiantes][claseNotaRepetida]);
    }
}

