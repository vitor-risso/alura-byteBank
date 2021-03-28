package br.com.example.myproject.test


fun typeFunctionPreferenceTest() {
    val myFunction: (Int, Int) -> Int = ::sum

    println(myFunction(5, 10))
}


fun sum(a: Int, b: Int): Int {
    return a + b
}
