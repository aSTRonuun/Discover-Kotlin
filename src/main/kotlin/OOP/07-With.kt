package OOP

fun main() {

    val mockPersonForTests = Person("John", 1985)
    mockPersonForTests.sayHello()
    mockPersonForTests.sayAge()

    with(mockPersonForTests) {
        sayHello()
        sayAge()
    }

}