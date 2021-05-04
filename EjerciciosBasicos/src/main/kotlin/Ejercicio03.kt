/*
 Realizar una función que imprima los primeros diez cuadrados perfectos. Los
cuadrados perfectos pueden ser calculados al multiplicar cada número natural por el
mismo. Los primeros cuatro cuadrados perfectos son: 1*1=1, 2*2=4, 3*3=9 y
4*4=16. Doce, por ejemplo, no es un cuadrado perfecto debido a que no existe ningún
número natural “m” tal que m*m=12.
 */

fun main() {
    perfectC()
}

fun perfectC(){
    for (i in 1..10){
        println(i*i)
    }
}