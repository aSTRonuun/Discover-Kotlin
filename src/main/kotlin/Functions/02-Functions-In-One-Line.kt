package Functions

fun main() {
    println(sumInOneLine(2, 3))
    println(sumInOneLineNoReturnType(2, 3))
}

fun sumInOneLine(a: Int, b: Int): Int = (a + b)

fun sumInOneLineNoReturnType(a: Int, b: Int) = (a + b)