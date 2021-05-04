/*
Crear una función que dado un arreglo de números sume los impares y multiplique
los pares
 */

fun main() {
    val myArray = arrayOf(5, 8, 9 ,10 , 2) // Creamos el arreglo con los numeros

    resolvparImpar(myArray) // Enviamos el arreglo a la funcion parImpar
}

fun resolvparImpar(myArray: Array<Int>) {
    var suma: Int
    var multi: Int

    suma = 0
    multi = 1

    for (element in myArray) { // utilizando un arreglo de enteros evaluamos cada elemento
        if ((element % 2) == 0 ){ // dentro del if evalua y dice si es o no Par o impar
            suma += element
        }else{
            multi *= element
        }
    }
    println("La suma de los pares es: $suma")
    println("La multiplicacion de los impares es: $multi")
}