package FlowControls.Exercise

fun main() {

    handleWelcomeParty()
}

fun handleWelcomeParty() {
    println("Welcome to Vitor's Party! What's your age?")

    val age = readLine()!!.toInt()
    if (!IsAdultParty(age)) {
        println("You are not allowed to enter!")
        return
    }

    println("What's your pass?")
    val pass = readLine()!!
    if (!IsPassValid(pass)) {
        println("You are not allowed to enter!")
        return
    }

    println("What's your code?")
    val code = readLine()!!
    if (!IsCodeValid(code, pass)) {
        println("You are not allowed to enter!")
        return
    }

    println("Welcome to the party!")
}


fun IsAdultParty(age: Int) = age >= 18

fun IsPassValid(pass: String) = pass == "commom" || pass == "premium" || pass == "luxo"

fun IsCodeValid(code: String, pass: String) =
    (code.startsWith("XT") && pass == "commom") ||
    (code.startsWith("XL") && pass == "premium") ||
    (code.startsWith("XL") && pass == "luxo")
