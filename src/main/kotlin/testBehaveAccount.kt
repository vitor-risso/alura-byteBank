fun testBehaveAccount() {
    val vitorAccount = Account("Vitor", 1000)
    vitorAccount.deposit(1500.00)

    val anaAccount = Account("Ana", 1001)
    anaAccount.deposit(1600.0)

    vitorAccount.cash(25.0)
    println(vitorAccount.saldo)

    vitorAccount.transfer(anaAccount, 25.0)
    println(anaAccount.saldo)
}