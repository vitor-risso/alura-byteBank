package br.com.example.myproject.test


fun typeFunctionPreferenceTest() {
    val myFunction: () -> Unit = ::test

    println(myFunction())
}


fun test() {
    println("OI")
}
