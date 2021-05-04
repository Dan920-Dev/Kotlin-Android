/*
 Realizar una función que reciba un número y retorna la respuesta del valor factorial
de dicho número. Dicha función debe ser hecha de manera recursiva.
 */

fun main() { // Funcion principal
    var num: Int

    println("Digite un numero entero y mostrare el factorial")
    num = readLine()!!.toInt()
    println(factorial(num)) // Llamada a la funcion y le enviamos el numero ingresado
}

fun factorial(a: Int): Int { // Funcion que calculara el factorial
    if(a > 1) { // si el numero es mayor que 1 retornara la multiplicacion del numero * el numero recibido
                // desminuido en 1
        return a * factorial(a - 1)
    }else{
        return a // sino solo retornaara dicho numero osea 1
    }
}