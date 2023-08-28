package OOP

fun main() {

    val data1: Form = Form(1, 2)
    val data2: Form = Form(1, 2)

    println(data1.equals(data2))
    println(data1.toString())

    val data3: DataForm = DataForm(1, 2)
    val data4: DataForm = DataForm(1, 2)

    println(data3.equals(data4))
    println(data3.toString())

    val dataCopy = data3.copy()
    println(dataCopy.toString())

}

class Form(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Form) {
            return a == other.a && b == other.b
        }
        return false
    }

    override fun toString(): String {
        return "a: $a, b: $b"
    }
}

data class DataForm(val a: Int, val b: Int)