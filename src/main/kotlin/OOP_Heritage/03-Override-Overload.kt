package OOP_Heritage

fun main() {
    var c = Computer3("Dell")
    //c.activate() // Error
    c.turnOn()
    c.boot()
    c.turnOff()
}

open class Eletronic3(var brand: String) {

    private fun activate() {
        println("Activating...")
    }

    fun turnOn() {
        activate()
        println("Turning on...")
    }

    open fun turnOff() {
        println("Turning off...")
    }
}

class Computer3(brand: String) : Eletronic3(brand) {
    fun boot() {
        println("Booting...")
    }

    fun save() {
        println("Saving...")
    }

    override fun turnOff() {
        save()
        super.turnOff()
    }
}