package br.com.example.myproject.model

class Client(
    val name: String,
    val cpf: String,
    private val pwd: Int
) : Authenticable {

    override fun auth(pwd: Int): Boolean {
        if (this.pwd == pwd) {
            return true
        }
        return false
    }
}