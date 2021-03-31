
/*
Constructor.
*/

// para declarar una clase usamos la palabra reservada class
class Frutas() { // dentro de los parentesis van los parametros
	var color: String = ""  // Propiedades
    var sabor: String = ""
    var precio: Int = 0
    var numHojas: Int = 0
    
    constructor(color: String, sabor: String, precio: Int): this(){ // Constructor
        this.color = color
        this.precio = precio
        this.sabor = sabor
    }
    
    constructor(color: String, sabor: String, precio: Int, numHojas: Int): this(){ // Constructor
        this.color = color
        this.precio = precio
        this.sabor = sabor
        this.numHojas = numHojas
    }
    
    fun pudrirse(){ // Creamos este metodo
        println("La fruta se esta pudriendo")
    }
}

fun main() {
	var manzanaconHojas = Frutas("rojo", "dulce", 3, 5) // Instanciamos este objeto
    var manzanasinHojas = Frutas("rojo", "dulce", 5)
    
    // accedemos a las propiedades de el objeto
    println(manzanaconHojas.color)
    manzanaconHojas.pudrirse()
}
