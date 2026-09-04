
public class SistemaCine {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE ASIGNACIÓN DE ASIENTOS ===");

        String[][] sala = new String[5][8];

        // Llenar la sala con D = Disponible
        for (int fila = 0; fila < sala.length; fila++) {

            for (int columna = 0; columna < sala[fila].length; columna++) {

                sala[fila][columna] = "D";

            }

        }


        System.out.print("       ");

        for (int columna = 0; columna < sala[0].length; columna++) {

            System.out.print((columna + 1) + "  ");

        }

        System.out.println();


        for (int fila = 0; fila < sala.length; fila++) {

            System.out.print("Fila " + (fila + 1) + " ");

            for (int columna = 0; columna < sala[fila].length; columna++) {

                System.out.print(sala[fila][columna] + "  ");

            }

            System.out.println();

        }

    }

}



