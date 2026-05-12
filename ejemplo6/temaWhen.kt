fun main(parametro: Array<String>) {
    print("Ingrese cordenada x del punto: ")
    val x = readln().toInt() // Se eliminó el punto extra aquí
    print("Ingrese cordenada y del punto: ")
    val y = readln().toInt()
    
    when {
        x > 0 && y > 0 -> println("El punto se encuentra en el primer cuadrante")
        x < 0 && y > 0 -> println("El punto se encuentra en el segundo cuadrante")
        x < 0 && y < 0 -> println("El punto se encuentra en el tercer cuadrante")
        x > 0 && y < 0 -> println("El punto se encuentra en el cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}