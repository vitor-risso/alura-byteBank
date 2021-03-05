fun conditionTest(saldo: Double) {
    when {
        saldo > 0.0 -> println("O saldo da sua conta está positiva em R$$saldo ")

        saldo == 0.0 -> println("Sua conta está zerada")

        else -> println("Sua conta está negativa em R$$saldo")
    }
}