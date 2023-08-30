package Collections_And_Functions

fun main() {

    val data = generateData()

    // minOf and maxOf return the min and max value of a collection
    println("The min calories is ${data.minOf { it.calories }}")
    println("The max calories is ${data.maxOf { it.calories }}")

    // minBy and maxBy return the object with the min and max value of a collection
    println(data.maxByOrNull { it.calories })
    println(data.minByOrNull { it.calories })
}