/**
 Tipos de datos en Kotlin
 * Strings con secuencia de escape 
 * Strings puros
 */

fun main() {
    var nombrePerro: String = "Firulais\nEscobar" // String con secuencia de escape
                                                  // Donde "\n" es salto de linea
                                                  // Donde "\t" es una tabulacion
    var nombreGato: String = """mish 
                               Escobar""" // String Puro
    var nombreMascota: String = "Rex"
    var apellidoMascota: String = "Rivera"
    
    // Formas de imprimir variables 
	println(nombrePerro) // Mostrando el nombre del perro
    println(nombreGato)  // Mostrando el nombre del gato
    println("El nombre del perro es: " + nombrePerro + " y el del gato es: " + nombreGato) // Concatenacion
    println("el nombre de la mascota es: $nombreMascota y su apellido es $apellidoMascota")
    
    
}