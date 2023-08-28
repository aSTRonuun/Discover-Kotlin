package OOP_Heritage

fun main() {
    var c = Computer("Dell")
    c.turnOn()
    c.turnOff()
    c.boot()
}

open class Eletronic(var brand: String) {
    fun turnOn() {
        println("Turning on...")
    }

    fun turnOff() {
        println("Turning off...")
    }
}

class Computer(brand: String) : Eletronic(brand) {
    fun boot() {
        println("Booting...")
    }
}