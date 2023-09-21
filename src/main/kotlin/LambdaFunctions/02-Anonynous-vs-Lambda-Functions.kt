package LambdaFunctions


interface EventListener {
    fun click()
}

class Form {
    fun clickJava(e: EventListenerJava) {}
    fun clickKotlin(e: EventListener) {}
}


fun main() {

    Form().clickJava { println("Hello") }
}