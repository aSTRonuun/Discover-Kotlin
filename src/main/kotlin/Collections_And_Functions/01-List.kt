package Collections_And_Functions

fun main() {

    val list1: List<Int> = listOf(1, 2, 3, 4, 5)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(list2[0])
    println(list2.size)

    list2.add(6)
    list2.add(7)

    list2.remove(7)
    list2.removeAt(0)

    println(list2.contains(5))
    println(list2)

    list2.clear()

    println(list2)
}