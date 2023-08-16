package FlowControls

fun main() {

    for (i in 1..10) {
        print("$i ")
    }

    println()

    val str = "Kotlin is amazing"
    for (c in str) {
        print("$c ")
    }

    println()

    for (i in 0..20 step 2) {
        print("$i ")
    }

    println()

    for (i in 20 downTo 0 step 2) {
        print("$i ")
    }
}