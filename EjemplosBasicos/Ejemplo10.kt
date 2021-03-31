/*
Estructura For
*/

fun main() {
    for(i in 1..10) print(i) // Declarando un for para imprimir numeros desde el 1 al 10
    
    for((indice, valor) in (2..6).withIndex()){ // Forma 2 obteniendo su indice 
        println("Esa es la vez numero ${indice} con el valor $valor")
    }
 }