package br.com.example.myproject.model

import br.com.example.myproject.exceptions.InsufficientBalanceException

abstract class Account(val owner: Client, val number: Int) {
    var saldo: Double = 0.0
        protected set

    companion object Counter {
        var totalAccount = 0
            private set
    }

    init {
        totalAccount++
    }

    fun deposit(n: Double) {
        if (n > 0) {
            this.saldo += n
        }
    }

    abstract fun cash(n: Double)

    fun transfer(to: Account, n: Double) {
        try {
            if (this.saldo > 0) {
                if (n <= this.saldo) {
                    this.saldo -= n
                    to.deposit(n)
                    return println("Transferencia de $owner feita para ${to.owner} no valor de R$$n ")
                }else{
                    throw InsufficientBalanceException()
                }
            }else{
                throw InsufficientBalanceException()
            }
        } catch (e: InsufficientBalanceException) {
            e.printStackTrace()
        }

    }
}