/*
Carlitos quiere conocer si paso la materia de programación de dispositivos móviles,
la materia cuenta con 5 actividades evaluadas, 3 parciales y 2 tareas, el parcial 1 vale
20%, el segundo y el tercer parcial valen 25% y cada tarea 15%, cree una función que
reciba un arreglo con las notas de Carlitos y realice los cálculos necesarios para
conocer si Carlitos paso la materia (nota mayor a 6.0) de ser así la función retorna
true y si no false
 */

fun main() {

    // Pidiendo datos para poblar el arreglo
       println("Carlitos ingresa la nota del parcial 1: ")
       var nota1 = readLine()!!.toFloat()
       println("Carlitos ingresa la nota del parcial 2")
       var nota2 = readLine()!!.toFloat()
       println("Carlitos ingresa la nota del parcial 3")
       var nota3 = readLine()!!.toFloat()
       println("Carlitos ingresa la nota de la tarea 1")
       var nota4 = readLine()!!.toFloat()
       println("Carlitos ingresa la nota de la tarea 2")
       var nota5 = readLine()!!.toFloat()

    var myArray = arrayOf(nota1, nota2, nota3, nota4, nota5) // llenando Arreglo

    print(aprobadoReprobado(myArray)) // LLamando la funcione imprimiendo el valor que retorna
}

fun aprobadoReprobado(myArray: Array<Float>): Boolean {
    var notaF: Double
    var notaParciales: Double
    var notaTareas: Double

    // Haciendo calculos necesarios
    notaParciales = (myArray[0] * 0.25) + (myArray[1] * 0.25) + (myArray[2] * 0.25)
    notaTareas = (myArray[3] * 0.15) + (myArray[4] * 0.15)
    // Obteniendo nota final
    notaF =  notaParciales + notaTareas

    return (notaF > 6) // si esto se cumple retorna true de aprobado
                       // sino false de reprobado
}