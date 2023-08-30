package Collections_And_Functions

fun main() {

    val data = generateData()

    println(data.map { it.calories }.average())
}