class Manager (val name: String, val cpf: String, val balance: Double, val pwd: Int) {

    fun bonificaiton(): Double {
        return balance * 0.2
    }

    fun password(pwd: Int): Boolean {
        if(this.pwd == pwd){
            return true
        }

        return false
    }
}