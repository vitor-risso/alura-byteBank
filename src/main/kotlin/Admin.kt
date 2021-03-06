abstract class Admin(
    name: String,
    cpf: String,
    balance: Double,
    protected val pwd: Int
) : Employee(name, cpf, balance) {


    open fun auth(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}