package Collections_And_Functions

fun main() {

    val data = generateData()

    println("How many calories in total? ${data.sumOf { it.calories }} ")

    println(listOf<Int>(1,2,3,4,5).sum())
}