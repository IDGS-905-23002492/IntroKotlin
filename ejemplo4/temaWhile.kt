fun main(){
    var cant = 0
    var suma = 0
    var valor: Int
    do {
        print("Ingrese un valor (0 para finalizar): ")
        valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }
    } while (valor != 0)
    if (cant != 0) {
        val promedio = suma / cant
        println("El promedio es: $promedio")
    } else {
        println("No se ingresaron valores")
    }
}