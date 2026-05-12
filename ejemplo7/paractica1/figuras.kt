fun main() {
    var opcion: Int
    do {
        println("\n--- MENÚ DE ÁREAS ---")
        println("1. Cuadrado\n2. Triángulo\n3. Círculo\n4. Rectángulo\n5. Salir")
        print("Elija una opción: ")
        opcion = readln().toInt()

        when (opcion) {
            1 -> calcularCuadrado()
            2 -> calcularTriangulo()
            3 -> calcularCirculo()
            4 -> calcularRectangulo()
            5 -> println("Saliendo...")
            else -> println("Opción no válida")
        }
    } while (opcion != 5)
}

fun calcularCuadrado() {
    print("Lado: ")
    val l = readln().toDouble()
    println("Área: ${l * l}")
}

fun calcularTriangulo() {
    print("Base: "); val b = readln().toDouble()
    print("Altura: "); val a = readln().toDouble()
    println("Área: ${(b * a) / 2}")
}

fun calcularCirculo() {
    print("Radio: ")
    val r = readln().toDouble()
    println("Área: ${3.1416 * r * r}")
}

fun calcularRectangulo() {
    print("Base: "); val b = readln().toDouble()
    print("Altura: "); val a = readln().toDouble()
    println("Área: ${b * a}")
}