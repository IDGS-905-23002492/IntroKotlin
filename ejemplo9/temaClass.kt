/*
La estructura basica en kotlin de una clase es:
Class[nombre de la clase]
[propiedades de la clase]
[metodos de la clase o funcioines]
*/

class Persona{
    var nombre:String=""
    var edad:Int=0


    fun inicializar(nombre:String,edad:Int){
        this.nombre=nombre
        this.edad=edad
    }

fun imprimir(){
    println("Nombre: $nombre y tiene una edad de: $edad años")
    
}

fun esMayorEdad(){
    if(edad >= 18)
    println("Es mayor de edad")
    else
    println("No es mayor de edad")
}
fun main(){
        val persona1: Persona
        persona1 = Persona()
        persona1.inicializar("Juan", 20)
        persona1.imprimir()
        persona1.esMayorEdad()
        val persona2: Persona
        persona2 = Persona()
        persona2.inicializar("Maria", 16)
        persona2.imprimir()
        persona2.esMayorEdad()

    }

}