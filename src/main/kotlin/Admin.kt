abstract class Admin(
     name: String,
     cpf: String,
     balance: Double,
    val pwd:Int
): Employee(name, cpf, balance) {


    open fun password(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }

        return false
    }
}