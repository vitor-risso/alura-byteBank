fun main() {
    val vitorAccount = Account("Vitor", 1000)
    vitorAccount.deposit(1500.00)

    val anaAccount = Account("Ana", 1001)
    anaAccount.deposit(1600.0)

    vitorAccount.cash(25.0)
    println(vitorAccount.saldo)

    vitorAccount.transfer(anaAccount, 25.0)
    println(anaAccount.saldo)

}


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

fun testCopyAndReferences() {
    val titular: String = "Vitor"
    val accountNumber: Int = 1000
    var saldo: Double = 0.0

    saldo += 50

//    println("O nome do titular é $titular")
//    println("O numero da conta é $accountNumber")
    saldo += 253.33

//    saldo = 0.0
//    saldo = -30.00

    // Saldo validation
    conditionTest(saldo)

    /* if(saldo >0.0){
         println("O saldo da sua conta está positiva em R$$saldo ")
     }else if(saldo == 0.0){
         println("Sua conta está zerada")
     } else{
         println("Sua conta está negativa em R$$saldo")
     }*/


    /*for(i in 0..10){
        if( i == 4){
           // break
            continue
        }
        println(i)
    }*/
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    for (x in 5 downTo 1 step 2) {
        println("X = $x")
    }


    val numberX = 10
    var numeroY = numberX

    println("numeroX $numberX")
    println("numeroy $numeroY")
}

fun conditionTest(saldo: Double) {
    when {
        saldo > 0.0 -> println("O saldo da sua conta está positiva em R$$saldo ")

        saldo == 0.0 -> println("Sua conta está zerada")

        else -> println("Sua conta está negativa em R$$saldo")
    }
}