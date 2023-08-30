package Collections_And_Functions

fun main() {
    val data = generateData()

    println("Has data: ${data.any()}")
    println("Qtd of recipes: ${data.count()}")

    println("First recipe: ${data.first()}")
    println("Last recipe: ${data.last()}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())
}