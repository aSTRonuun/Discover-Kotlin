package OOP_Heritage

fun main() {
    var c = Computer2("Dell")
    //c.activate() // Error
    c.turnOn()
    c.turnOff()
    c.boot()
}

open class Eletronic2(var brand: String) {

    private fun activate() {
        println("Activating...")
    }

    fun turnOn() {
        activate()
        println("Turning on...")
    }

    fun turnOff() {
        println("Turning off...")
    }
}

class Computer2(brand: String) : Eletronic2(brand) {
    fun boot() {
        println("Booting...")
    }
}