package Collections_And_Functions

fun main() {
    val data = generateData()

    println("Has data: ${data.any()}")
    println("Qtd of recipes: ${data.count()}")
}

fun generateData(): List<Recipe> {
    return listOf(
        Recipe("Lasagna", 1200, listOf(Ingredient("Tomato sauce", 1), Ingredient("Lasagna", 5), Ingredient("Cheese", 10))),
        Recipe("Pasta", 500, listOf(Ingredient("Pasta", 1), Ingredient("Cheese", 10))),
        Recipe("Rice and beans", 1000),
        Recipe("Egg", 100, listOf(Ingredient("Egg", 2), Ingredient("Cheese", 1))),
        Recipe("Hamburger", 2000, listOf(Ingredient("Bread", 1), Ingredient("Meat", 3), Ingredient("Cheese", 1)))
    )
}

data class Recipe(val title: String, val calories: Int, val ingredients: List<Ingredient> = listOf())
data class Ingredient(val name: String, val qtd: Int)