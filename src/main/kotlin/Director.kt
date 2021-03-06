class Director(
    name: String,
    cpf: String,
    balance: Double,
     pwd: Int,
    val plr: Double
) : Admin(name, cpf, balance, pwd), Authenticable {

    override val bonus: Double
        get() {
            return balance + plr
        }
}