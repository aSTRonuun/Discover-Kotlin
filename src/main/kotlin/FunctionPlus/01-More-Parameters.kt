package FunctionPlus

fun main() {
    sendAdress(city = "São Paulo", state = "SP", street = "Rua dos Bobos", cep = "12345-678", number = 0)
}

fun sendAdress(street: String, city: String, state: String, cep: String, number: Int, complement: String = "") {
    println("Street: $street")
    println("City: $city")
    println("State: $state")
    println("CEP: $cep")
    println("Number: $number")
    println("Complement: $complement")
}