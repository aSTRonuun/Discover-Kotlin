package Collections_And_Functions

fun main() {

    val data = generateData()

    println(data.map { it.title })
    println(data.map { RecipeAndQtdIngredients(it.title, it.ingredients.size) })
}

data class RecipeAndQtdIngredients(val name: String, val qtdIngredients: Int)