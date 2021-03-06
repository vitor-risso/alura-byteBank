class Director(
    name: String,
    cpf: String,
    balance: Double,
    val pwd: Int,
    val plr: Double
) : Employee(name, cpf, balance) {

    override val bonus: Double
        get() {
            return balance + plr
        }

     fun password(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}