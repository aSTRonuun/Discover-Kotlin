package FlowControls.Exercise

fun main() {

    val boxVolume = 2000
    val ballonsVolume = 7

    val ballonsCount = calculateHowManyBalloonsFit(boxVolume, ballonsVolume)

    println("The box can fit $ballonsCount ballons")
}

fun calculateHowManyBalloonsFit(maxBoxValume: Int, ballonsValume: Int) : Int {
    var ballonsCount = 0
    var sumTotal = 0

    while ((sumTotal + ballonsValume) < maxBoxValume) {
        sumTotal += ballonsValume
        ballonsCount++
    }

    return ballonsCount
}
