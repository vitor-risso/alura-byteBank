open class Manager(name: String, cpf: String, balance: Double, val pwd: Int) : Employee(name, cpf, balance) {

    override val bonus: Double
        get() {
            return super.bonus + balance
        }


    open fun password(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}