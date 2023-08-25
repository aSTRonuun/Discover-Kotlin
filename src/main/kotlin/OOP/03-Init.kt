package OOP

import java.util.Date

fun main() {

    var dog = Animal("Dog")
    println(dog.voice)

    var cat = Animal("Cat")
    println(cat.voice)

    var unknown = Animal("")
    println(unknown.voice)

}

class Animal(var specie: String) {

    var voice: String = ""

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

