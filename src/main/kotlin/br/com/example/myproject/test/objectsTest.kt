package br.com.example.myproject.test

import br.com.example.myproject.model.*
import differentAccountsTest

fun objectsTest() {

    val vitor = Client("Vitor", "", Address("", 0, "", "", "", "", ""), 1)
    val savinsgaccount = SavingsAccount(vitor, 1)
    val currentAccount = CurrentAccount(vitor, 2)

    differentAccountsTest()

    println("O total de contas é " + Account.totalAccount)

    val ana = object {
        val name = "Ana"
        val cpf = "11111"
        val pwd = 1000

        fun auth(pwd: Int) {
            this.pwd === pwd
        }
    }

    println(ana.name)

}
