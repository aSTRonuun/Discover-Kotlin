package Collections_And_Functions

fun main() {

    // Collection set doesn't accept repeated values
    val set1: Set<String> = setOf("Berlin", "Paris", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.remove("São Paulo")
    // set2.removeAt(0) // Doesn't exist
    set2.contains("São Paulo")

    set2.clear()
    set2.size

}