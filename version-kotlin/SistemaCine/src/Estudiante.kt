data class Estudiante(
    val nombre: String,
    val edad: Int,
    val promedio: Double
)

fun main() {
    val estudiante1 = Estudiante("Ana", 20, 4.2)
    val estudiante2 = Estudiante("Luis", 22, 3.8)
    val estudiante3 = Estudiante("María", 21, 4.5)

    val estudiantes = arrayOf(estudiante1, estudiante2, estudiante3)

    println("Recorrido del arreglo de estudiantes:")
    for (est in estudiantes) {
        println(est)
    }

    estudiantes[1] = estudiantes[1].copy(promedio = 4.0)

    println("\nDespués de modificar el promedio de Luis:")
    for (est in estudiantes) {
        println(est)
    }
}