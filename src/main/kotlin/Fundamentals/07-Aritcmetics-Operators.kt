package Fundamentals

fun main() {

    var age = 30;
    age++;
    println(age)

    age--;
    println(age)

    age *= 2;
    println(age)

    age /= 2;
    println(age)

    println("Age is par? ${age % 2 == 0}")
}