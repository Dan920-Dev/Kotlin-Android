/**
 Tipos de datos en Kotlin
 * Double, Float, Int, Long, Short
 * Strings, Arrays, Booleans
 */

fun main() {
    var edadPerro: Int = 18 // Declarando una variable de tipo INT con un valor = 18 
    var peso = 18.5F // Declarando una variable de tipo FLOAT 
    var char: Char = '3' // Declarando una variable de tipo CHAR
    var charToInt: Int = char.toInt() // Declarando una variable de tipo INT y convirtiendo 
    							      // a decimal la variable char
    var nombrePerro: String = "Firulais" // Declarando unavariable de tipo STRING 
    
	println(nombrePerro) // Mostrando el nombre
    println(nombrePerro[0]) // Mostrando la letra en la posicion 0
}