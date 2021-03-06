open class Employee(val name: String, val cpf: String, val balance: Double) {
    open fun bonus(): Double {
        return balance * 0.1
    }
}