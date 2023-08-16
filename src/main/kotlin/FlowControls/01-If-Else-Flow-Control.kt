package FlowControls

fun main() {
    println(IsAdult(18))
    println(IsAdultUsingReturnIf(18))
}

fun IsAdult(age: Int): Boolean {
    if (age >= 18) {
        return true
    } else {
        return false
    }
}

fun IsAdultUsingReturnIf(age: Int): Boolean {
    return if (age >= 18) {
        true
    } else {
        false
    }
}