/*
Cree una función que dado un número entero no negativo sume los dígitos que lo
conforman.
 */

fun main() {
    var numUser: Long
    println("Ingrese un numero entero")
    numUser = readLine()!!.toLong()
    sum(numUser)
}

fun sum(num: Long){
    var numero: Long
    var sumDigit = 0L
    var extNum: Long
    numero = num

    while (numero != 0L) {
        extNum = numero % 10
        numero /= 10
        sumDigit += extNum
    }
    println("La suma de los digitos del entero  es: $sumDigit")
}