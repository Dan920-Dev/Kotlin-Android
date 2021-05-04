/*
 Realizar una función que reciba un String y devuelve el String pero al reverso.
Ejemplo: “hola”-> “aloh”
 */

fun main() { // Funcion principal
    revers() // Llamada a la funcion
}

fun revers() { // Funcion que muestra inversamente un String
    var text: String

    print("Digite una palabra")
    text = readLine().toString()
    println(text.reversed()) // reserved() hace que el String se invierta

}