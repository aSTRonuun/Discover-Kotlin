package FunctionPlus

fun main() {

    println(avarage(9f, 8f, 7f, 6f, 5f, 4f, 3f, 2f, 1f))

    println(avarage(9f, 8f, 7f, 6f, 5f))
}

fun avarage(vararg grades: Float): Float {
    var sum = 0f

    for (grade in grades) sum += grade

    return sum / grades.size
}