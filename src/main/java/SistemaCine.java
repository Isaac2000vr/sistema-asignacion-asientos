import java.util.Scanner;

public class SistemaCine {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== SISTEMA DE ASIGNACIÓN DE ASIENTOS ===");

        // creo matriz de 5 filas y 8 columnas
        String[][] sala = new String[5][8];

        // ponemos temporalmente los asientos como disponibles
        for (int fila = 0; fila < sala.length; fila++) {
            for (int columna = 0; columna < sala[fila].length; columna++) {
                sala[fila][columna] = "D";
            }
        }

        int opcion;

        do {
            System.out.println("MENÚ");
            System.out.println("1. Mostrar mapa de asientos");
            System.out.println("2. Reservar un asiento");
            System.out.println("3. Liberar un asiento");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMapa(sala);
                    break;
                case 2:
                    // aquí irá la lógica para reservar
                    break;
                case 3:
                    // aquí irá la lógica para liberar
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }

    public static void mostrarMapa(String[][] sala) {
        // columnas con índices
        System.out.print("       ");
        for (int columna = 0; columna < sala[0].length; columna++) {
            System.out.print((columna + 1) + "  ");
        }
        System.out.println();

        // filas con índices
        for (int fila = 0; fila < sala.length; fila++) {
            System.out.print("Fila " + (fila + 1) + " ");

            for (int columna = 0; columna < sala[fila].length; columna++) {
                System.out.print(sala[fila][columna] + "  ");
            }
            System.out.println();
        }
    }
}


