package FlowControls.Exercise

fun main() {

    print(calculateNumberOfMonthToOvercome(10000f, 10000f))
}

fun calculateNumberOfMonthToOvercome(salary1: Float, salary2: Float) : Int {
    var amount1 = 0f
    var amount2 = 0f
    var countMonth = 0

    do {
        amount1 += ((salary1 * 0.05f) * 2) + (amount1 * 0.002f)

        amount2 += ((salary2 * 0.05f)) + (amount2 * 0.008f)

        countMonth++
    }while (amount1 > amount2)

    return countMonth
}

