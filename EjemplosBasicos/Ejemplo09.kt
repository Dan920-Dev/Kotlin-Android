/*
Estructura when
*/

fun main() {
    val calificacion = 5
    var resena: String

    when(calificacion){ // Forma de declarar un when
        1 -> resena = "No me gusto la comida, me causo malestar"
        2 -> resena = "No me gusto  pero la bebida si"
        3 -> resena = "Mediocre"
        4 -> resena = "No me gusto pero puede mejorar"
        5 -> resena = "Lo mejor que e probado"
        else -> resena = "Reseña mal escrita" // Si ninguna se cumple, muestra lo que esta en el else
    }

    println(resena)
}