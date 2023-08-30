package Collections_And_Functions

fun main() {

    val data = generateData()

    println(data.filter { it.calories < 500 })
}