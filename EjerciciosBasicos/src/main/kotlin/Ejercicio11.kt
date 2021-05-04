/*
Cree una función para determinar si un texto es palíndromo (Una palabra o texto que
se lea igual de revés y derecho ej:anona, ana, radar, etc)
 */

fun main() {
    var palabraTexto: String
    print("Digite una palabra: ")
    palabraTexto = readLine().toString()
    palindrome(palabraTexto)
}

fun palindrome(palabraTexto: String) {
    if (palabraTexto == palabraTexto.reversed()) {
        println("La palabra que ingresaste es Palindrome")
    }else{
        println("La palabra que ingresaste no es palindrome")
    }
}