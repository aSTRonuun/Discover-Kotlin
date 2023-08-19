package NullSafaty

fun main() {

    var str: String? = null

    // Verify if str is null
    println(str?.length)

    // Force the execution of the code
    println(str!!.length)

    println("No broken code")
}