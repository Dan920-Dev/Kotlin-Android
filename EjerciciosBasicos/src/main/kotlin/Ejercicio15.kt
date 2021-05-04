/*
Intenta adivinar la palabra secreta, se te dará la primera y última letra de la palabra y
el número de letras que posee la palabra.
Ejemplo: "pupusa"
la palabra secreta tiene 6 letras
p _ _ _ _ a
Cree una función que diga si pudiste adivinar la palabra antes de que pasen 3
intentos.
 */

fun main() {
    // Mostrando instrucciones y pistas al usuario
    println("Intenta adivinar la palabra secreta")
    println("Pista 1: La primera letra de la palabra es p")
    println("Pista 2: La ultima letra de la palabra es a")
    println("Pista 3: La palabra cuenta con 6 letras")
    println("Solo tienes 3 intentos, sino abras perdido")
    gameP()
}

fun gameP() {
    var adivinaste: Boolean
    var palabra: String
    var count: Int
    count = 1
    adivinaste = true

    do {
        if (count > 3){
            println("Has perdido :( ")
            adivinaste = true
            break
        }
        println("Ingresa una palabra, este es el intento $count")
        palabra = readLine().toString()
        if (palabra.equals("pupusa")){
            println("Has adivinado la palabra FELICIDADES")
            adivinaste = true
            break
        }else{
            if (count <=3){
                adivinaste = false
                count++
            }else{
                println("Has perdido :( ")
                adivinaste = true
                break
            }
        }
    }while (!adivinaste)

}
