package br.com.example.myproject

fun main() {
    println("STARTING... \n")

//    typeFunctionPreferenceTest()
//    typeClassPreferenceTest()


    val myLambdaFunction: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(myLambdaFunction(5, 8))

    val myAnotherLambdaFunction = { a: Int, b: Int ->
        a + b
    }
    println(myAnotherLambdaFunction(7, 8))

    //Lambda function returns the last line

    val calculatorBonus: (salary: Double) -> Double = lambda@{ salary ->
        if (salary > 1000.0) {
            return@lambda salary + 200.0
        }
        return@lambda salary+200.0
    }

    println(calculatorBonus(100.0))
}

