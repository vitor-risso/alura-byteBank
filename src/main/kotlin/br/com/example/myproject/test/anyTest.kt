package br.com.example.myproject.test

import br.com.example.myproject.model.Address

fun anyTest(){
    val address = Address(numero = 321, cep = "000-000", logradouro = "Rua dois")
    val newAddress = Address(cidade = "Campinas", cep = "000-000", logradouro = "Rua dois")

    println(address.toString())
    println(newAddress.toString())
    println(newAddress.equals(address))

}