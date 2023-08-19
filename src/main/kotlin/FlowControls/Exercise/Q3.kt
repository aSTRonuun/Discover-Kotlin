package FlowControls.Exercise

fun main() {

    println("Enter a integer number A:")
    val a = readLine()!!.toInt()

    println("Enter a integer number B:")
    val b = readLine()!!.toInt()

    println("Enter a integer number C:")
    val c = readLine()!!.toInt()

    if (isEquilateralTriangle(a, b, c)) {
        println("Is a equilateral triangle")
    } else {
        println("Is not a equilateral triangle")
    }
}

fun isEquilateralTriangle(a: Int, b: Int, c: Int) = a == b && b == c