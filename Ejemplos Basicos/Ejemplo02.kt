
/*
 Variables
 para declarar una variable debemos usar var o val.
 */

fun main() {
    var edadPerro = 18 // Declarando una variable con un valor = 18
    val nombrePerro = "Firulais" // Declarando una constante donde
                                 // se debe usar val
    
    edadPerro = 15 // aca nuestra variable cambia a un valor = 15 
                  // ya que puede ir cambiando durante la ejecucion del programa
                  
    println(nombrePerro + " tiene " + edadPerro + "años") // Mostrando nombre del perro y
    													//el valor de nuestra variable en pantalla
}