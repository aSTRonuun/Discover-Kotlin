package FlowControls.Exercise

fun main() {
    var str = invertString("My name is Julius")

    println("String inverted: $str")
}

fun invertString(str: String) : String {
    var invertedString = ""
    var index = str.length - 1

    while (index >= 0) {
        invertedString += str[index]

        index--
    }

    return invertedString
}