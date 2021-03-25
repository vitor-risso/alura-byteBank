package br.com.example.myproject

fun main() {
    println("STARTING... \n")

    val entrada = "1"
    val value: Int? = try {
        entrada.toInt()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }
    if(value != null){
        println("Valor recebudo $value")
    }

    val valueWithTax = if(value!= null){
        value + 32
    } else
        null

    funcao1()

    println("Stop")
}

fun funcao1() {
    println("Função 1 inicio")
    funcao2()
    println("Função 1 fim")
}

fun funcao2() {
    println("Função 2 inicio")
    println("Função 2 fim")
}




