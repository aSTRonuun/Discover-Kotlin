package Functions

fun main() {
    val str = "Kotlin is amazing    "

    println("String length: ${str.length}")

    println("Position (index) 0 of the string: ${str[0]}")

    println("The string star with 'Kotlin'? ${str.startsWith("Kotlin")}")
    println("The string ends with 'Kotlin'? ${str.endsWith("Kotlin")}")

    println("Get the substring from index 8 to 15: ${str.substring(8, 15)}")

    println("Replace the string 'amazing' with 'awesome': ${str.replace("amazing", "awesome")}")
    println(str.lowercase())
    println(str.uppercase())

    println(str.trim())
}
