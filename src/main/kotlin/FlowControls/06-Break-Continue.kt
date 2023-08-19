package FlowControls

fun main() {

    var i = 0
    while (i < 20) {
        i++
        if (i % 2 != 0) {
            continue
        }
        print("$i ")
    }

    println()

    var j = 0
    while (j < 20) {
        j++
        if (j > 10) {
            break
        }
        print("$j ")
    }
}