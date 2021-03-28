package br.com.example.myproject

import br.com.example.myproject.model.Address

fun main() {
    println("STARTING... \n")

    var nullAddress: Address? = null
    var nonNullAddress: Address? = Address(logradouro = "Rua teste", complemento = "das")

    println(nullAddress?.logradouro)
    println(nonNullAddress?.logradouro)


    nonNullAddress?.let {
        println(it.logradouro)

        val complementWidht = it.complemento?.length ?: IllegalArgumentException("Complemento deve ser preenchido")

        println(complementWidht)
    }


}


