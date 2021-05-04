/*
Cree una función que reciba un arreglo de números enteros y retorne el arreglo ya
ordenado
 */

fun main() {
    val myArray = arrayOf(5, 1, 7, 90, 3, 10) // Llenamos esste arreglo con valores desordenados
    print(myArray)
    ordenar(myArray) // Llamamos la funcion a la cual le enviamos el arreglo

}

fun ordenar(myArray: Array<Int>) {
    myArray.sort() // Ordenamos la funcion de menor a mayor
    for (element in myArray) { // Haciendo uso de for la mostramos ya ordenada
        print("$element ")
    }

}