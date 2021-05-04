/*
Dada una serie de palabras separadas por espacios, escribir la frase formada por las
mismas palabras en orden inverso.
 */

fun main() {
    var cantPalabras: Int
    var arrayPalabras= mutableListOf<String>()
    var palabra: String
    var  palabraInvert: String
    println("Cuantas palabras desea ingresar? ")
    cantPalabras = readLine()!!.toInt()
    for (i in 1..cantPalabras) {
        print("Ingresa la palabra numero $i")
        palabra = readLine().toString()
        palabraInvert = palabra.reversed()
        arrayPalabras.add(palabra)
    }

    for (element in arrayPalabras) {
        print("${element.reversed()} ")
    }
}