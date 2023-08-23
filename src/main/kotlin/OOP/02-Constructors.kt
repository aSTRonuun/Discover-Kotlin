package OOP

import java.util.Date

fun main() {

    var person = Person("John", 1985)
    person.sayHello()
    person.sayAge()

}

class PersonWithDoubleConstructors(var name: String, val yearOfBirth: Int) {

    // Secondary constructor
    constructor(name: String, yearOfBirth: Int, lastName: String): this(name, 0) {
        this.lastName = lastName
    }


    var age: Int = Date().year - yearOfBirth
    var lastName: String = ""

    fun sayHello() {
        println("Hello, my name is $name")
    }

    fun sayAge() {
        println("I'm $age years old")
    }
}