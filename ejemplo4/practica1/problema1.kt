fun main(){
    var diametro: Double
do {
    print("Ingrese el diámetro de la tubería (mayor a 0): ")
    diametro = readln().toDouble()
} while (diametro <= 0)
println("Diámetro válido registrado: $diametro")
}