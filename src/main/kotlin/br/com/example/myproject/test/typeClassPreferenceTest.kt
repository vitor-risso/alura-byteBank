package br.com.example.myproject.test


fun typeClassPreferenceTest() {
    val myClass: () -> Unit = Test()
    println(myClass())
}
class Test : () -> Unit {
    override fun invoke() {
        println("executando classe")
    }
}
