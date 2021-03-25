package br.com.example.myproject

import br.com.example.myproject.model.Address
import employeeTest

fun main() {
    println("STARTING... \n")
    val address = Address()

    imprime(2)
    imprime("dsa")
    imprime(true)
    imprime(address)

    employeeTest()

}

fun imprime(value: Any) {
    println(value)
}



