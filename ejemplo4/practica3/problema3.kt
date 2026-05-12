fun main(){
    var intentos = 0
val claveCorrecta = "1234"

while (intentos < 3) {
    print("Ingrese la clave de seguridad: ")
    val entrada = readln()
    
    if (entrada == claveCorrecta) {
        println("Acceso concedido")
        break 
    } else {
        intentos++
        println("Clave incorrecta. Intento $intentos de 3")
    }
}

if (intentos == 3) {
    println("Controlador PLC bloqueado.")
}
}