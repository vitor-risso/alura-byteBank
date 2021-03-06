package br.com.example.myproject.model

class CurrentAccount(
    name: Client,
    number: Int
) :
    Account(name, number) {

    override fun cash(n: Double) {
        val taxValue = n + 0.01
        if (this.saldo > 0) {
            if (n < this.saldo) {
                this.saldo -= taxValue
                println("Saque efetuado no valor de $n")
            } else {
                println("Saldo insuficiente para esse saque, tente um valor inferior a $saldo")
            }
        } else {
            println("Sua conta está negativa ou zerada")
        }
    }
}