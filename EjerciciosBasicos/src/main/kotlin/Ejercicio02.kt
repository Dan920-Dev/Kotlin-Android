/*
Realizar una función que rote una lista de “k” elementos, “n” veces. Por ejemplo, [1,
2, 3, 4, 5, 6] rotado dos veces se vuelve [3, 4, 5, 6, 1, 2].
 */

fun main() { // Funcion principal
    var kElements: Int
    var rList: Int

    println("Cuantos elementos desea en la lista")
    kElements = readLine()!!.toInt()  // Recibiendo dato por teclado y pasandolo a Int
    println("Cuatas veces desea rotar la llista?")
    rList = readLine()!!.toInt()   // Recibiendo dato por teclado y pasandolo a Int
    println(kElements)
    rotList(kElements, rList) // enviando valores a la funcion que rotara la lista
}

// Funcion que rotara n veces la lista
fun rotList(k: Int, n: Int) {
    var myList = mutableListOf<Int>() // Declarando Lista
    var num: Int
    var aux: Int

    // Ciclo que llena la lista de valores
    for (i in 1..k){ // recorrera desde 1 hasta 5 en la lista para ir llenandole cada posicion
        println("Digite el valor $i en la lista")
        num = readLine()!!.toInt()
        myList.add(num) // Añadiendo valores a la lista 1 por 1
    }

    // Ciclo que rota la lista
    for (i in 1..n){
        aux = myList[0] // guarda el primer valor en una variable auxiliar
        myList.remove(myList[0]) // remueve ese valor de la lista
        myList.add(aux) // ahora vuelve  agregar ese valor
                        // ya que se agrega al final de la lista
    } // Este proceso lo hace N veces

    print(myList) // Mostramos la lista
}