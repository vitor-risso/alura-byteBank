class CurrentAccount(
    name: String,
    number: Int
) :
    Account(name, number) {

    override fun cash(n: Double) {
        val taxValue = n + 0.1
       super.cash(taxValue)
    }
}