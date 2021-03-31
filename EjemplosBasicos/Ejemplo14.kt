/*
Clases, propiedades, objetos y metodos.
*/

// para declarar una clase usamos la palabra reservada class
class Frutas(color: String, sabor: String, precio: Int ) { // dentro de los parentesis van los parametros
	var color: String = ""  // Propiedades
    var sabor: String = ""
    var precio: Int = 0
    
    init{ // Inicializamos los valores
        this.color = color
        this.precio = precio
        this.sabor = sabor
    } //para tomar los datos que estamos recibiendo por medio de los parametros
    
    fun pudrirse(){ // Creamos este metodo
        println("La fruta se esta pudriendo")
    }
}

fun main() {
	var manzana = Frutas("rojo", "dulce", 3) // Instanciamos este objeto
    
    // accedemos a las propiedades de el objeto
    println(manzana.color)
    manzana.pudrirse()
}