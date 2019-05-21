import model.Categoria

fun main(args : Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    do {
        println("""
        Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
        val response : String? = readLine()
        when(response){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Seleccionaste: 3. Salir")
            else -> println("Opción no valida intente de nuevo")
        }
    }while (response != "3")


}

fun makeRecipe(){//hacer una receta
    val listaIngregientes = arrayOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites")
    for ((index, ingrediente) in listaIngregientes.withIndex()){
        println("${index+1}. $ingrediente")
    }
}

fun viewRecipe(){//mostrar recetas
    println("Ver mis recetas")
}