package model

class Receta(var name : String, var ingredientes : ArrayList<Ingrediente>){

    fun mostrarIngredientes(){
        for (ingredeinte in ingredientes){
            println("${ingredeinte.alimento} - ${ingredeinte.cantidad} ${ingredeinte.unidadDeMedida}")
        }
    }
}