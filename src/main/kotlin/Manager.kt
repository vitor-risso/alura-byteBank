open class Manager(name: String, cpf: String, balance: Double, val pwd: Int) : Employee(name, cpf, balance) {

    override fun bonus(): Double {
        return super.bonus() + balance
    }


    open fun password(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}