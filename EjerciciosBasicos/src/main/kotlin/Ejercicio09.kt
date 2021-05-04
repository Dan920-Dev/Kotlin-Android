/*
Crear una Clase Calculadora donde pueda hacer las operaciones básicas (Sumar,
Restar, Multiplicación, Dividir) cada función deberá recibir dos números enteros y
luego imprimir la respuesta de la operación a realizar.
 */

open class Calculadora(a: Int, b: Int){
    var a: Int = 0
    var b: Int = 0

    init {
        this.a = a
        this.b = b
    }

    fun getSum(): Int {
        return a +b
    }
    fun mult(){
        print(a*b)
    }
    fun divi()  {
        print(a/b)
    }
    fun rest()  {
        print(a-b)
    }

}
fun main() {
    var suma = Calculadora(10,2)

}