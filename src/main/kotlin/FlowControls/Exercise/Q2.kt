package FlowControls.Exercise

fun main() {

    println("Enter a integer number A:")
    val a = readLine()!!.toInt()

    println("Enter a integer number B:")
    val b = readLine()!!.toInt()

    if (isSquare(a, b)) {
        println("Is a square")
    } else {
        println("Is not a square")
    }
}

fun isSquare(a: Int, b: Int) = a == b