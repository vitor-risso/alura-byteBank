package br.com.example.myproject.model

import br.com.example.myproject.exceptions.AuthFailureException
import br.com.example.myproject.exceptions.InsufficientBalanceException

abstract class Account(val owner: Client, val number: Int) : Authenticable {
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

    override fun auth(pwd: Int): Boolean {
        return owner.auth(pwd)
    }

    fun transfer(to: Account, n: Double, pwd: Int) {
        try {
            if (this.saldo > 0) {
                if (n <= this.saldo) {
                    if (!auth(pwd)) {
                        throw AuthFailureException()
                    }
                    this.saldo -= n
                    to.deposit(n)
                    return println("Transferencia de $owner feita para ${to.owner} no valor de R$$n ")
                } else {
                    throw InsufficientBalanceException("Saldo insuficiente, tente uma transferencia num valor de ${this.saldo}")
                }
            } else {
                throw InsufficientBalanceException("Seu saldo está zerado")
            }
        } catch (e: InsufficientBalanceException) {
            e.printStackTrace()
        }

    }
}