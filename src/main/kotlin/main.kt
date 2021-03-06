fun main() {
    println("STARTING... \n")

    val currentAccount = CurrentAccount("Vitor", 1005)
    val savingsAccount = SavingsAccount("Ana", 1006)

    currentAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Saldo corrente apos deposito ${currentAccount.saldo}")
    println("Saldo pupança após deposito  ${savingsAccount.saldo} \n")

    currentAccount.cash(100.00)
    savingsAccount.cash(100.00)

    println("Saldo corrente apó saque ${currentAccount.saldo}")
    println("Saldo pupança apó saque ${savingsAccount.saldo} \n")


    currentAccount.transfer(savingsAccount, 50.00)

    println("Saldo corrente após transferencia  ${currentAccount.saldo}")
    println("Saldo pupança após transferencia  ${savingsAccount.saldo}\n")

//    val account = Account("vitor", 1000)
//    account.deposit(100.0)
//    account.cash(50.0)
//
//    println(account.saldo)
}

