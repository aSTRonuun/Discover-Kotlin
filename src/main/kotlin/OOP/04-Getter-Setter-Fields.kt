package OOP

import java.util.Date

fun main() {

    var dog = AnimalWithGetterAndSetter("Dog")
    println(dog.voice)

    dog.voice = "Bark"

    println(dog.voice)
}

class AnimalWithGetterAndSetter(var specie: String) {

    var voice: String = ""
        get() {
            println("Accessing get")
            return field
        }
        set(value) {
            println("Accessing set")
            field = value
        }

    init {
        voice = if (specie == "Dog") {
             "Woof"
        } else if (specie == "Cat") {
            "Meow"
        } else {
            "Unknown"
        }
    }
}

