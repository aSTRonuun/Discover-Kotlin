package OOP_Heritage

fun main() {
    val analyst = Analyst(1000f)

    ShowEmployeeBonus(analyst)

    val manager = Manager(1000f)

    ShowEmployeeBonus(manager)
}

interface Employee {
    var salary: Float
    fun bonus(): Float
}

fun ShowEmployeeBonus(employee: Employee) {
    println("Employee bonus: ${employee.bonus()}")
}

class Manager(override var salary: Float) : Employee {
    override fun bonus(): Float {
        return salary * 0.2f
    }
}

class Analyst(override var salary: Float) : Employee {
    override fun bonus(): Float {
        return salary * 0.1f
    }
}

