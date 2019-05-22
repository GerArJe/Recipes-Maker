import model.Categoria
import model.Ingrediente
import model.Receta

var recetas = ArrayList<Receta>()

fun main(args : Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    do {
        println()
        println("""
        Este es el menú principal
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
    println()
    println("¡Ha seleccionado hacer una receta!")
    var ingredientes = ArrayList<Ingrediente>()
    var ingrediente : Ingrediente
    println("Ingrese en nombre de la receta")
    val responseNombreReceta : String? = readLine()
    do {
        println()
        println("""
        Selecciona la opción deseada:
        1. Seleccionar ingrediente
        2. Salir
        """.trimIndent())
        val response : String? = readLine()
        when(response){
            "1" ->  {
                do {
                    println()
                    val listaCategoria = arrayOf("Agua","Leche","Carne","Verduras","Frutas",
                        "Cereal","Huevos","Aceites")
                    println("Seleccione la categoria del ingrediente que esta buscando")
                    for ((index, categoria) in listaCategoria.withIndex()){
                        println("${index+1}. $categoria")
                    }
                    println("9. Salir")
                    val responseCategoria : String? = readLine()
                    when(responseCategoria){
                        "1" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaAgua())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaAgua[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaAgua[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "2" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaLeche())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaLeche[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaLeche[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "3" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaCarne())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaCarne[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaCarne[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "4" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaVerduras())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaVerduras[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaVerduras[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "5" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaFrutas())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaFrutas[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaFrutas[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "6" ->{
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaCereal())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaCereal[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaCereal[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "7" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaHuevos())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaHuevos[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaHuevos[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        "8" -> {
                            println("Selecione el ingediente que desea")
                            println(Categoria().mostrasListaAceites())
                            val responseIngrediente : Int? = readLine()!!.toInt()
                            ingrediente = Ingrediente(
                                Categoria().listaAceites[responseIngrediente!!.minus(1)].alimento,
                                Categoria().listaAceites[responseIngrediente!!.minus(1)].unidadDeMedida)
                            println("Ingrese la cantidad que desea teniendo " +
                                    "en cuanta la unidad de medida")
                            val responseCantidad : Int = readLine()!!.toInt()
                            ingrediente.cantidad = responseCantidad
                            ingredientes.add(ingrediente)
                        }
                        else -> println("Opción no valida intente de nuevo")
                    }
                }while (responseCategoria != "9")

            }
            "2" -> println("Seleccionaste: 3. Salir")
            else -> println("Opción no valida intente de nuevo")
        }
    }while (response != "2")
    recetas.add(Receta(responseNombreReceta!!, ingredientes))
}

fun viewRecipe(){//mostrar recetas
    println()
    println("Estas son tus recetas")
    for ((index, receta) in recetas.withIndex()){
        println()
        println("${index+1}. ${receta.name}: ")
        println(receta.mostrarIngredientes())
    }
}