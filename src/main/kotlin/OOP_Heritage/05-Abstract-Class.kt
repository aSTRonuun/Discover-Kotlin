package OOP_Heritage

fun main() {
    val monkey = Monkey("King Kong")

    monkey.talk()
}

abstract class Mammal(val name: String) {
    abstract fun talk()
}

class Monkey(name: String) : Mammal(name) {
    override fun talk() {
        println("Uga uga")
    }
}
