package FunctionPlus

fun main() {

    println(genericAvarage(false, 9f, 8f, 7f, 6f, 5f, 4f, 3f, 2f, 1f, "Aloha", true))
}

fun <T, J> genericAvarage(abc: J, vararg grades: T): Float {

    var sum = 0f
    for (grade in grades)
        if(grade is Float) sum += grade

    return sum / grades.size
}