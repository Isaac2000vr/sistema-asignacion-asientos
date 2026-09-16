import java.util.Scanner

class Asiento {
    var estado: String = "D"
    var cliente: String? = null

    fun reservar(nombreCliente: String) {
        estado = "O"
        cliente = nombreCliente
    }

    fun liberar() {
        estado = "D"
        cliente = null
    }

    fun estaDisponible(): Boolean = estado == "D"
}

fun crearSala(filas: Int, columnas: Int): Array<Array<Asiento>> {
    return Array(filas) { Array(columnas) { Asiento() } }
}

fun mostrarMapa(sala: Array<Array<Asiento>>) {
    print("       ")
    for (columna in sala[0].indices) {
        print("${columna + 1}  ")
    }
    println()

    for (fila in sala.indices) {
        print("Fila ${fila + 1} ")
        for (columna in sala[fila].indices) {
            print("${sala[fila][columna].estado}  ")
        }
        println()
    }
}

fun main() {
    println("=== SISTEMA DE ASIGNACIÓN DE ASIENTOS ===")

    val sala = crearSala(5, 8)
    val teclado = Scanner(System.`in`)
    var opcion: Int

    do {
        println("\n--- MENÚ ---")
        println("1. Mostrar mapa de asientos")
        println("2. Reservar un asiento")
        println("3. Liberar un asiento")
        println("4. Salir")
        print("Elige una opción: ")
        opcion = teclado.nextInt()

        when (opcion) {
            1 -> mostrarMapa(sala)

            2 -> {
                print("Ingresa el número de fila (1 a 5): ")
                val fila = teclado.nextInt() - 1
                print("Ingresa el número de columna (1 a 8): ")
                val columna = teclado.nextInt() - 1

                if (fila < 0 || fila >= sala.size || columna < 0 || columna >= sala[0].size) {
                    println("Posición inválida.")
                } else if (sala[fila][columna].estaDisponible()) {
                    teclado.nextLine() // limpia el salto de línea pendiente
                    print("Nombre del cliente: ")
                    val nombreCliente = teclado.nextLine()
                    sala[fila][columna].reservar(nombreCliente)
                    println("Asiento reservado con éxito para $nombreCliente.")
                    mostrarMapa(sala)
                } else {
                    println("Ese asiento ya está ocupado por ${sala[fila][columna].cliente}.")
                }
            }

            3 -> {
                print("Ingresa el número de fila (1 a 5): ")
                val fila = teclado.nextInt() - 1
                print("Ingresa el número de columna (1 a 8): ")
                val columna = teclado.nextInt() - 1

                if (fila < 0 || fila >= sala.size || columna < 0 || columna >= sala[0].size) {
                    println("Posición inválida.")
                } else if (!sala[fila][columna].estaDisponible()) {
                    sala[fila][columna].liberar()
                    println("Asiento liberado con éxito.")
                    mostrarMapa(sala)
                } else {
                    println("Ese asiento ya está disponible.")
                }
            }

            4 -> println("Saliendo del sistema...")

            else -> println("Opción inválida.")
        }

    } while (opcion != 4)
}