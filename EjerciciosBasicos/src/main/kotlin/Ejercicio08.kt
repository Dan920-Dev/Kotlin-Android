/*
 Realizar una función que recibe un arreglo de Strings que contiene distintos nombres
de países y la función muestra debe mostrar en pantalla, por cada elemento en el array,
“soy de” seguido del nombre del país correspondiente.
 */

fun main() {
    var myArray = arrayOf("El Salvador", "EEUU", "China", "Holanda")
    funArray(myArray) // Llamamos a la funcion y enviamos el arreglo
}

fun funArray(myArray: Array<String>) { // Se recibe el arreglo y con un for se muestra el mensaje requerido
    for ((index, element) in myArray.withIndex()){
        println("Soy de $element ")
    }
}
