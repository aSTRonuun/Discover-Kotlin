package Functions.Exercise

fun main() {

    val str = "Kotlin is a language to develop Android Apps"

    println(replaceAtoX(str))
}

// TODO: Create a function that replaces all the "a" or "A" characters with "x"
fun replaceAtoX(str: String) = str.lowercase().replace("a", "x")


