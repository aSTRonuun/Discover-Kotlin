class Concierge {

    fun handleWelcomeParty(age: Int, pass: String, code: String): String {

        if (!isAdultParty(age)) return ("You are not allowed to enter!")

        if (!isPassValid(pass)) return ("You are not allowed to enter!")

        if (!isCodeValid(code, pass)) return ("You are not allowed to enter!")

        return  ("Welcome to the party!")
    }


    fun isAdultParty(age: Int) = age >= 18

    fun isPassValid(pass: String) = pass == "commom" || pass == "premium" || pass == "luxo"

    fun isCodeValid(code: String, pass: String) =
        (code.startsWith("XT") && pass == "commom") ||
        (code.startsWith("XL") && pass == "premium") ||
        (code.startsWith("XL") && pass == "luxo")
}