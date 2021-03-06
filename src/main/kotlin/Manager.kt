open class Manager(
    name: String,
    cpf: String,
    balance: Double,
    pwd: Int
) : Admin(name, cpf, balance, pwd), Authenticable {

    override val bonus: Double
        get() {
            return +balance
        }


}