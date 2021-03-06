import br.com.example.myproject.model.Address
import br.com.example.myproject.model.Client
import br.com.example.myproject.model.CurrentAccount
import br.com.example.myproject.model.SavingsAccount

fun differentAccountsTest() {
    val currentAccount = CurrentAccount(Client(
        "Vitor",
        "111.111.111-11",
        pwd =123
    ), 1005)

    val savingsAccount = SavingsAccount(Client(
        "Ana",
        "222.222.222-22",
        pwd=456,
        address = Address(logradouro = "Rua 1")
    ), 1006)

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


    println("${savingsAccount.owner.address.logradouro} \n")
}
