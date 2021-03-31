/*
Constructor y tipos de clases.
*/
// si colocamos open class - la clase estara abierta para poder ser herdada
// sino sera una clase de tipo Final
// 
// para declarar una clase usamos la palabra reservada class
// 
open class Frutas() { // dentro de los parentesis van los parametros
	var color: String = ""  // Propiedades
    var sabor: String = ""
    var precio: Int = 0
    var numHojas: Int = 0
    
    constructor(color: String, sabor: String, precio: Int): this(){ // Constructor
        this.color = color
        this.precio = precio
        this.sabor = sabor
    }
    
    fun pudrirse(){ // Creamos este metodo
        println("La fruta se esta pudriendo")
    }
}

class FrutasConGrasa(): Frutas() { // Frutas con grasa hereda las propiedades de frutas
    var cantidad: Int = 0
    
    constructor(grasa: Int): this(){
        this.cantidad = grasa
    }
}

fun main() {
	var manzana = Frutas("rojo", "dulce", 3) // Instanciamos este objeto
    var aguacate = FrutasConGrasa(10)
    aguacate.color = "verde" // le asignamos color al aguacate
    
    // accedemos a las propiedades de el objeto
    println(manzana.color)
    manzana.pudrirse()
    
    // Mostramos color y cuanta grasa contiene el aguacate
    println(aguacate.color)
    println(aguacate.cantidad)
}