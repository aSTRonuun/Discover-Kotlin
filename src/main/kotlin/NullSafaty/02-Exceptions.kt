package NullSafaty

import kotlin.NullPointerException

fun main() {

    try {

        val s: String? = null
        var division = 10 / 0

        println(s!!.length)

    } catch (e: NullPointerException) {
        println("Null Pointer Exception")
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println("Generic Exception")
    }  finally {
        println("Finally block")
    }

    println("No broken code")
}