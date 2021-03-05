fun testCopyAndReferences() {
    val titular: String = "Vitor"
    val accountNumber: Int = 1000
    var saldo: Double = 0.0

    saldo += 50

//    println("O nome do titular é $titular")
//    println("O numero da conta é $accountNumber")
    saldo += 253.33

//    saldo = 0.0
//    saldo = -30.00

    // Saldo validation
    conditionTest(saldo)

    /* if(saldo >0.0){
         println("O saldo da sua conta está positiva em R$$saldo ")
     }else if(saldo == 0.0){
         println("Sua conta está zerada")
     } else{
         println("Sua conta está negativa em R$$saldo")
     }*/


    /*for(i in 0..10){
        if( i == 4){
           // break
            continue
        }
        println(i)
    }*/
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    for (x in 5 downTo 1 step 2) {
        println("X = $x")
    }


    val numberX = 10
    var numeroY = numberX

    println("numeroX $numberX")
    println("numeroy $numeroY")
}
