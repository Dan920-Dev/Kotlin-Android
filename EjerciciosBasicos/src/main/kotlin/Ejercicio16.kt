import java.util.stream.Collectors

/*
Crear una función que reciba dos listas mutables de números enteros y retorne otra
lista con ambas combinadas y sin valores repetidos
*/

fun main () {
    var list1 = mutableListOf<Int>(30, 5, 8, 1, 3, 2) // Creamos dos listas con datos diferentes
    var list2 = mutableListOf<Int>(2, 4, 1,45, 90, 3) // o tambien estos datos pueden estar repetidos
                                                      // al final la funcion retornara una sola
                                                      // sin elementos repetidos

    print(returnListC(list1, list2))
}

fun returnListC(list1: MutableList<Int>, list2: MutableList<Int>) : MutableList<Int> {
    var myList = mutableListOf<Int>()
    println(list1)
    println(list2)

    myList.addAll(list2) // aca  se añade la lista 1 a una nueva donde estaran todos los datos
    myList.addAll(list1) // aca  se añade la lista 2 a una nueva donde estaran todos los datos

    myList.sort() // Aca se ordenan los datos de menor a mayor

    var repetido: Int
    var actual: Int

    myList = myList.stream().distinct().collect(Collectors.toList()) // el metodo distinct nos ayuda a eliminar duplicados

    return myList // Retornamos nnuestra lista ya sin elementos repetidos
}

