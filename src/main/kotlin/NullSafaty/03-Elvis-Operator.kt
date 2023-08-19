package NullSafaty

fun main() {

    val str:String? = null

    // Traditional if-else
    if (str == null) {
        println("String is null")
    } else {
        println("String is not null")
    }

    // Elvis operator
    println(str ?: "String is null")

    // Terinary function
    println(if (str == null) "String is null" else "String is not null")
}