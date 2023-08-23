package OOP

import java.util.Date

fun main() {

    var person = Person("John", 1985)
    person.sayHello()
    person.sayAge()

}

class Person(var name: String, val yearOfBirth: Int) {


    var age: Int = Date().year - yearOfBirth

    fun sayHello() {
        println("Hello, my name is $name")
    }

    fun sayAge() {
        println("I'm $age years old")
    }
}