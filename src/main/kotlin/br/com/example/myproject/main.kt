package br.com.example.myproject

fun main() {
    println("STARTING... \n")
    val myLambdaFunction: () -> Unit = {
        println("Entrou no meu lambda")
    }
    myLambdaFunction()
}

