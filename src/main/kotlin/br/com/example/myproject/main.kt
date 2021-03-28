package br.com.example.myproject

import authTest
import br.com.example.myproject.model.Address

fun main() {
    println("STARTING... \n")

    Address(logradouro = "rau dois", numero = 321)
        .let {
            "${it.logradouro}, ${it.numero}".toUpperCase()
        }.let(::println)


    listOf(Address(complemento = "casa"), Address(), Address(complemento = "apartamento"))
        .filter{

            it.complemento.isNotEmpty()
        }.let (::println)

    sum(1, 5){
        print(it)
    }

}

fun sum(a:Int, b:Int, result: (Int) -> Unit){
    result(a+b)
}



