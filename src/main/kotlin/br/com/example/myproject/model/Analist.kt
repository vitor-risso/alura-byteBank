package br.com.example.myproject.model

class Analist(
    name: String,
    cpf: String,
    balance: Double
) : Employee(name, cpf, balance) {

    override val bonus: Double
        get() {
            return  balance
        }
}