class Account(val name: String, val number: Int) {
    var saldo: Double = 0.0
        private set(value) {
            if (value > 0) {
                field += value
            }
        }

    fun deposit(n: Double) {
        this.saldo += n
    }

    fun cash(n: Double) {
        if (this.saldo > 0) {
            if (n < this.saldo) {
                this.saldo -= n
            } else {
                println("Saldo insuficiente para esse saque, tente um valor inferior a $saldo")
            }
        } else {
            println("Sua conta está negativa ou zerada")
        }
    }

    fun transfer(to: Account, n: Double) {

        if (this.saldo > 0) {
            if (n < this.saldo) {
                this.saldo -= n
                to.deposit(n)
                return println("Transferencia de $name feita para ${to.name} no valor de R$$n ")
            }
            return println("Saldo insuficiente para esse saque, tente um valor inferior a $saldo")
        }
        return println("Sua conta está negativa ou zerada")
    }
}