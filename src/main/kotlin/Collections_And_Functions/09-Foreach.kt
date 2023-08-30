package Collections_And_Functions

fun main() {

    val data = generateData()

    data.filter { it.calories > 500 }.forEach { println(it.title) }
}