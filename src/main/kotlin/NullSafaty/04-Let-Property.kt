package NullSafaty

fun main() {

    var str: String? = null

    if (str != null) {
        str.lowercase()
        str.uppercase()
        str.length
    }

    str?.let {
        it.lowercase()
        it.uppercase()
        it.length
    }
}