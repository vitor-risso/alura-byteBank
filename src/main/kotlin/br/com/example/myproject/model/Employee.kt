package br.com.example.myproject.model

abstract class Employee(val name: String, val cpf: String, val balance: Double) {
    abstract  val bonus: Double

}