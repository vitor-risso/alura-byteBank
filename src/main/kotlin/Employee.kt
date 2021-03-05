class Employee(val name: String, val cpf: String, val balance: Double) {
    fun bonificaiton(): Double {
        return balance * 0.1
    }
}