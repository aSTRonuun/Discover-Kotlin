package Functions.Exercise

fun main() {

    val years = 2

    println("${years} years in months is ${yearsInMonths(years)}")

    println("${years} years in days is ${yearsInDays(years)}")

    println("${years} years in weeks is ${yearsInWeeks(years)}")

    println("${years} years in hours is ${yearsInHours(years)}")

    println("${years} years in minutes is ${yearsInMinutes(years)}")

    println("${years} years in seconds is ${yearsInSeconds(years)}")
}
fun yearsInMonths(years: Int) = years * 12
fun yearsInDays(years: Int) = years * 365
fun yearsInWeeks(years: Int) = years * 52
fun yearsInHours(years: Int) = yearsInDays(years) * 24
fun yearsInMinutes(years: Int) = yearsInHours(years) * 60
fun yearsInSeconds(years: Int) = yearsInMinutes(years) * 60


