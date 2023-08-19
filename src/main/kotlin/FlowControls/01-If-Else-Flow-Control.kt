package FlowControls

fun main() {
    println(isAdult(18))
    println(isAdultUsingReturnIf(18))
}

fun isAdult(age: Int): Boolean {
    if (age >= 18) {
        return true
    } else {
        return false
    }
}

fun isAdultUsingReturnIf(age: Int): Boolean {
    return if (age >= 18) {
        true
    } else {
        false
    }
}