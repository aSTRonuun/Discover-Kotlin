package Fundamentals

fun main() {

    val name = "John"
    val lastName = "Snow"

    println("My name is " + name + " " + lastName) // Concatenation
    println("My name is $name $lastName") // String template

    var str = "Bla bla bla" +
            "Bla bla bla" +
            "Bla bla bla"

    println(str)
}