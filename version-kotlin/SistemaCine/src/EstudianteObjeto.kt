class EstudianteObjeto(
    val nombre: String,
    val edad: Int,
    private var _promedio: Double
) {
    val promedio: Double
        get() = _promedio

    fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad, Promedio: $promedio")
    }

    fun setPromedio(nuevoPromedio: Double) {
        _promedio = nuevoPromedio
    }
}

fun main() {
    val obj1 = EstudianteObjeto("Ana", 20, 4.2)
    val obj2 = EstudianteObjeto("Luis", 22, 3.8)
    val obj3 = EstudianteObjeto("María", 21, 4.5)

    val objetos = arrayOf(obj1, obj2, obj3)

    println("Recorrido llamando mostrarInfo():")
    for (obj in objetos) {
        obj.mostrarInfo()
    }

    objetos[1].setPromedio(4.0)

    println("\nDespués de modificar el promedio de Luis con setPromedio():")
    for (obj in objetos) {
        obj.mostrarInfo()
    }
}