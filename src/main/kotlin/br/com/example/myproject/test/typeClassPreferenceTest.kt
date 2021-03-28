package br.com.example.myproject.test


fun typeClassPreferenceTest() {
    val myClass: (Int, Int) -> Int = Sum()
    println(myClass(7, 3))
}

class Sum : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int) = p1 + p2

}
