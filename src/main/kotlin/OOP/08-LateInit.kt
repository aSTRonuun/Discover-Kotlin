package OOP

fun main() {
    var recipe = Recipe()
    recipe.showRecipe()

    recipe.generateRecipe()

    println(recipe.firs_instruction)
}

class Recipe {

    lateinit var firs_instruction: String

    fun generateRecipe() {
        firs_instruction = "Wash the vegetables"
    }

    fun showRecipe() {
        if(!::firs_instruction.isInitialized) {
            println("Recipe not generated")
        } else {
            println(firs_instruction)
        }
    }
}