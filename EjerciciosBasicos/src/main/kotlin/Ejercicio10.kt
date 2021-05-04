/*
Realizar una función que reciba un arreglo de números y por cada número en dicho
arreglo compruebe si es impar o par.
 */

fun main() {
    val myArray = arrayOf(5, 8, 9 ,10 , 3) // Creamos el arreglo con los numeros

    parImpar(myArray) // Enviamos el arreglo a la funcion parImpar
}

fun parImpar(myArray: Array<Int>) { // Funcion que dice si es par o impar
    for (element in myArray) { // utilizando un arreglo de enteros evaluamos cada elemento
        if ((element % 2) == 0 ){ // dentro del if evalua y dice si es o no Par o impar
            println("Se encontro numero par: $element")
        }else{
            println("Se encontro numero Impar: $element")
        }
    }

}