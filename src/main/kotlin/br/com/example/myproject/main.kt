package br.com.example.myproject

import br.com.example.myproject.model.Address

fun main() {
    println("STARTING... \n")
    val address = Address(numero = 321, cep = "000-000", logradouro = "Rua dois")
    val newAddress = Address(cidade = "Campinas", cep = "000-000", logradouro = "Rua dois")

    println(address.toString())
    println(newAddress.toString())
    println(newAddress.equals(address))


}

fun imprime(value: Any) {
    println(value)
}



