package LambdaFunctions
// Anonymous Functions { parameters -> body }

fun abc(x: Int) {}

fun main() {

    val a = { println("Hello World by Lambda Function") }

    val b = {x : Int -> x * x }

    val c = {x : Int, y : Int -> x * y}

    println(c(5,5))
}

fun receiveA(lambda: () -> Unit) {}

fun receiveB(lambda: (x : Int) -> Int) {}

fun receiveC(lambda: (x1 : Int, x2: Int) -> Int) {}