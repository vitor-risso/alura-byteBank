package br.com.example.myproject.test

import br.com.example.myproject.model.Address

fun nullableTest(){
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