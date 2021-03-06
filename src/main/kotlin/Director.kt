class Director(
    name: String,
    cpf: String,
    balance: Double,
    pwd: Int,
    val plr: Double
) : Manager(name, cpf, balance, pwd) {

    override val bonus: Double
        get() {
            return super.bonus + plr
        }

    override fun password(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}