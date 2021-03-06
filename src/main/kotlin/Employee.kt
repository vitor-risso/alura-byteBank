open class Employee(val name: String, val cpf: String, val balance: Double) {
    open val bonus: Double
        get() {
            return balance * 0.1
        }
}