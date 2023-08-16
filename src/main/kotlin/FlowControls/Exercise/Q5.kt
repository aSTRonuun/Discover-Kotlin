package FlowControls.Exercise

fun main() {

    print1To50Ascending()
    println()

    print1To50Descending()
    println()

    print1To5oAscendingNoMultiplesOf5()
    println()

    sum1to500()
    println()

    printLadderWithNumber(5)
    println()
}

fun print1To50Ascending() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun print1To50Descending() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun print1To5oAscendingNoMultiplesOf5() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun sum1to500() {
    var sum = 0
    for (i in 1..500) {
        sum += i
    }
    print(sum)
}

fun printLadderWithNumber(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("# ")
        }
        println()
    }
}

