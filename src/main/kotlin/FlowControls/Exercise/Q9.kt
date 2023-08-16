package FlowControls.Exercise

fun main() {
    println("The result is ${verifySimilarChars("hsdbchudooxx")}")
}

fun verifySimilarChars(str: String) : Boolean {
    str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0

    while (i < str.length) {
        if (str[i] == 'x') {
            countX++
        } else if(str[i] == 'o') {
            countO++
        }

        i++
    }

    return countX == countO
}