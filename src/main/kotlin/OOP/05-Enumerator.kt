package OOP

import java.util.Date

fun main() {

    for (p in Priority.values()) {
        println(p)
    }
}

fun selectEnum(p: Priority) {
    println(p)
}

enum class Priority(val value: Int) {
    LOW(1) {
        override fun toString(): String {
            return "Low priority"
        }
    },
    MEDIUM(2) {
        override fun toString(): String {
            return "Medium priority"
        }
    },
    HIGH(3) {
        override fun toString(): String {
            return "High priority"
        }
    }
}
