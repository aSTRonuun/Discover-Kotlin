package OOP_Heritage

fun main() {
    val app = App()
    app.start(object : Event {
        override fun onSuccess() {
            println("Success!")
        }
    })
}

interface Event {
    fun onSuccess()
}

class App {
    fun start(e: Event) {
        println("opening conections...")
        println("loading data...")
        println("closing conections...")
        e.onSuccess()
    }
}

