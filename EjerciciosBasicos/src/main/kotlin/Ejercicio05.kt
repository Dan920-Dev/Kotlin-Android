/*
Realizar una función que calcule los primeros diez números de la serie de Fibonacci.
 */

fun main() { // Funcion principal
    fibo() // llamada a funcion fibonacci
}

fun fibo() { // funcion que calcula la serie
    var ant: Int
    var cur: Int
    var sum: Int

    ant = 0
    cur = 1


    for (i in 1..10){ // Ciclo que hace las operaciones
        print("$ant  ") // Al principio mostramos el valor de cero despues la suma
        sum = ant + cur // sumamos el anterior y el actual
        ant = cur    // el anterior toma el valor actual
        cur = sum // el actual el valor de la suma
    }
}