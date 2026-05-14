class Persona(nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de: $edad años")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad")
        else
            println("No es mayor de edad")
    }
}

fun main() {
    val persona1 = Persona("Juan", 20)
    persona1.imprimir()
    persona1.esMayorEdad()
}