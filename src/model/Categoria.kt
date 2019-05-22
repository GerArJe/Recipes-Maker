package model

class Categoria(){
    var listaAgua = ArrayList<Ingrediente>()
    var listaLeche = ArrayList<Ingrediente>()
    var listaCarne = ArrayList<Ingrediente>()
    var listaVerduras = ArrayList<Ingrediente>()
    var listaFrutas = ArrayList<Ingrediente>()
    var listaCereal = ArrayList<Ingrediente>()
    var listaHuevos = ArrayList<Ingrediente>()
    var listaAceites = ArrayList<Ingrediente>()

    init {
        listaAgua.add(Ingrediente("Agua mineral", "ml"))
        listaAgua.add(Ingrediente("Agua con gas", "ml"))
        listaAgua.add(Ingrediente("Agua fría", "ml"))
        listaAgua.add(Ingrediente("Agua caliente", "ml"))
        listaAgua.add(Ingrediente("Agua a temperatura ambiente", "ml"))

        listaLeche.add(Ingrediente("Leche","ml"))
        listaLeche.add(Ingrediente("Yogurt", "ml"))
        listaLeche.add(Ingrediente("Mantequilla", "g"))
        listaLeche.add(Ingrediente("Queso", "g"))

        listaCarne.add(Ingrediente("Carne bóvida","g"))
        listaCarne.add(Ingrediente("Carne porcina", "g"))
        listaCarne.add(Ingrediente("Carne ovina", "g"))
        listaCarne.add(Ingrediente("Carne de pollo", "g"))
        listaCarne.add(Ingrediente("Carne de pescado", "g"))

        listaVerduras.add(Ingrediente("Zanahoria", "g"))
        listaVerduras.add(Ingrediente("Rábano", "g"))
        listaVerduras.add(Ingrediente("Puerro", "g"))
        listaVerduras.add(Ingrediente("Cebolla", "g"))
        listaVerduras.add(Ingrediente("Coliflor", "g"))
        listaVerduras.add(Ingrediente("Zapallo", "g"))
        listaVerduras.add(Ingrediente("Brócoli", "g"))
        listaVerduras.add(Ingrediente("Arvejas", "g"))
        listaVerduras.add(Ingrediente("Berenjena", "g"))

        listaFrutas.add(Ingrediente("Fresa", "g"))
        listaFrutas.add(Ingrediente("Uvas", "g"))
        listaFrutas.add(Ingrediente("Plátano", "g"))
        listaFrutas.add(Ingrediente("Manzana", "g"))
        listaFrutas.add(Ingrediente("Naranja", "g"))
        listaFrutas.add(Ingrediente("Pera", "g"))
        listaFrutas.add(Ingrediente("Cereza", "g"))

        listaCereal.add(Ingrediente("Avena", "g"))
        listaCereal.add(Ingrediente("Trigo", "g"))
        listaCereal.add(Ingrediente("Arroz", "g"))
        listaCereal.add(Ingrediente("Maíz", "g"))

        listaHuevos.add(Ingrediente("Huevos de codorniz", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de pato", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Ñandú", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Gallina", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Pavo", "unidades"))

        listaAceites.add(Ingrediente("Aceite de maíz", "ml"))
        listaAceites.add(Ingrediente("Aceite de soja", "ml"))
        listaAceites.add(Ingrediente("Aceite de oliva", "ml"))
        listaAceites.add(Ingrediente("Aceite de girasol", "ml"))
        listaAceites.add(Ingrediente("Aceite de sésamo", "ml"))
    }

    fun mostrasListaAgua(){
        println("Lista Agua")
        for((index,ingrediente) in listaAgua.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaLeche(){
        println("Lista Leche")
        for((index,ingrediente) in listaLeche.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaCarne(){
        println("Lista Carne")
        for((index,ingrediente) in listaCarne.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaVerduras(){
        println("Lista Verduras")
        for((index,ingrediente) in listaVerduras.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaFrutas(){
        println("Lista Frutas")
        for((index,ingrediente) in listaFrutas.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaCereal(){
        println("Lista Cereal")
        for((index,ingrediente) in listaCereal.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaHuevos(){
        println("Lista Huevos")
        for((index,ingrediente) in listaHuevos.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }

    fun mostrasListaAceites(){
        println("Lista Aceites")
        for((index,ingrediente) in listaAceites.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedida}")
        }
    }
}