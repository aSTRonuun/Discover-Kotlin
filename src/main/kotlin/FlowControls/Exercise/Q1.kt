package FlowControls.Exercise

fun main() {
    println(getBonus("Director", 2))
    println(getBonusWhen("Software Engineer"))
}

fun getBonus(rule: String, timeExperience: Int): Float {
    return if (rule == "Director") {
        if (timeExperience < 2) {
            2000f
        } else {
            3000f
        }
    } else if (rule == "Manager") {
        if (timeExperience < 1) {
            1500f
        } else {
            1800f
        }
    } else if (rule == "Software Engineer") {
        1000f
    } else if (rule == "Intern") {
        500f
    } else {
        0f
    }
}

fun getBonusWhen(rule: String): Float {
    return when(rule) {
        "Director" -> 2000f
        "Manager" -> 1500f
        "Software Engineer" -> 1000f
        "Intern" -> 500f
        else -> 0f
    }
}