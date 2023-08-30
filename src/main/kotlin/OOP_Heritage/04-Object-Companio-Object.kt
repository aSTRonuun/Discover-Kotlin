package OOP_Heritage

fun main() {
    println(Mathemathic.PI)
    println(Mathemathic.object2.PI)
}

class Mathemathic {
    companion object {
        val PI = 3.1415
    }

    object object2 {
        val PI = 3.1415
    }
}