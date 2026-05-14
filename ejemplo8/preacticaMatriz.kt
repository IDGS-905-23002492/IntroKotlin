/*
    -----Suma de dos matrices 3x3 en Kotlin---
    Crear un programa que permita al usuario ingresar por teclado los valores de
    dos matrices de tamaño 3x3 y posteriormente realiza la suma de ambas matrices,
    mostrando el resultado en pantalla.

    ---Explicación del programa---
    Se crean tres matrices:
        o   matriz1 para almacenar la primera matriz.
        o   matriz2 para almacenar la segunda matriz.
        o   resultado para guardar la suma.
*/

fun main() {
    // Declaración e inicialización de las tres matrices 3x3
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    // Captura de datos para la primera matriz
    println("--- Ingresa los valores para la Primera Matriz (3x3) ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingrese el valor para matriz1[$i][$j]: ")
            matriz1[i][j] = readln().toInt()
        }
    }

    // Captura de datos para la segunda matriz
    println("\n--- Ingresa los valores para la Segunda Matriz (3x3) ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingrese el valor para matriz2[$i][$j]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    // Proceso de suma de matrices
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    // Impresión del resultado
    println("\n--- Resultado de la Suma ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]}\t")
        }
        println() // Salto de línea para formar las filas de la matriz
    }
}