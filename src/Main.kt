fun main(args : Array<String>){
    val opciones = """
        Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

    println(":: Bienvenido a Recipe Maker ::")
    do {
        println(opciones)
        val response : String? = readLine()
        when(response){
            "1" -> println("Seleccionaste: 1. Hacer una receta")
            "2" -> println("Seleccionaste: 2. Ver mis recetas") 
            "3" -> println("Seleccionaste: 3. Salir")
        }
    }while (response != "3")
}
