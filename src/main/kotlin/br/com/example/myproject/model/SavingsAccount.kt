package br.com.example.myproject.model

class SavingsAccount(
    name: Client,
    number: Int
) :
    Account(name, number) {
    override fun cash(n: Double) {
        if (this.saldo > 0) {
            if (n < this.saldo) {
                this.saldo -= n
                println("Saque efetuado no valor de $n")
            } else {
                println("Saldo insuficiente para esse saque, tente um valor inferior a $saldo")
            }
        } else {
            println("Sua conta está negativa ou zerada")
        }
    }
}