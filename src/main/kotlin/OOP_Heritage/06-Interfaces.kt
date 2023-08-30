package OOP_Heritage

fun main() {
    val monkey = Monkey2("King Kong")

    monkey.talk()
    monkey.attack()
}

interface Wild {
    fun attack()
}

abstract class Mammal2(val name: String) {
    abstract fun talk()
}

class Monkey2(name: String) : Mammal(name), Wild {
    override fun talk() {
        println("Uga uga")
    }

    override fun attack() {
        println("Attack!")
    }
}
