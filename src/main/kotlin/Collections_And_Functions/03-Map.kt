package Collections_And_Functions

fun main() {

    val map1 = mapOf<String, String>(Pair("France", "Paris"), Pair("Spain", "Madrid"), Pair("Italy", "Rome"))
    val map2 = mutableMapOf<String, String>(Pair("France", "Paris"), Pair("Spain", "Madrid"), Pair("Italy", "Rome"))

    map2["Germany"] = "Berlin"
    println(map2)

    map2.remove("Spain")
    println(map2.contains("Italy"))
    println(map2.size)
    map2.clear()


    println(map2)

}