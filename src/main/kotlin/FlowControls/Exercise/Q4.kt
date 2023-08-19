package FlowControls.Exercise

fun main() {

    handleWelcomeParty()
}

fun handleWelcomeParty() {
    println("Welcome to Vitor's Party! What's your age?")

    val age = readLine()!!.toInt()
    if (!isAdultParty(age)) {
        println("You are not allowed to enter!")
        return
    }

    println("What's your pass?")
    val pass = readLine()!!
    if (!isPassValid(pass)) {
        println("You are not allowed to enter!")
        return
    }

    println("What's your code?")
    val code = readLine()!!
    if (!isCodeValid(code, pass)) {
        println("You are not allowed to enter!")
        return
    }

    println("Welcome to the party!")
}


fun isAdultParty(age: Int) = age >= 18

fun isPassValid(pass: String) = pass == "commom" || pass == "premium" || pass == "luxo"

fun isCodeValid(code: String, pass: String) =
    (code.startsWith("XT") && pass == "commom") ||
    (code.startsWith("XL") && pass == "premium") ||
    (code.startsWith("XL") && pass == "luxo")
