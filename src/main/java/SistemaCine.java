public class SistemaCine {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE ASIGANCIION DE ASIENTOS ===");

        String[][] sala = new String[5][8];

        for (int fila = 0; fila < sala.length; fila++) {

            for (int columna = 0; columna < sala[fila].length; columna++) {

                sala[fila][columna] = "D";



            }

        }

        for (int fila = 0; fila < sala.length; fila++) {

            for (int columna = 0; columna < sala[fila].length; columna++) {

                System.out.print(sala[fila][columna] + " ");

            }

            System.out.println();
        }

    }

}


