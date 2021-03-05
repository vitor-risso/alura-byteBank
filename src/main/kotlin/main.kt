fun main() {
    println("STARTING... \n")

    val vitor = Employee("Vitor", "111.111.111-11", 1000.00,)

    println(vitor.name)
    println(vitor.cpf)
    println(vitor.balance)

    println(vitor.bonificaiton())



    val ana = Manager("Ana", "222.222.222-22", 2000.00, 123)

    println(ana.name)
    println(ana.cpf)
    println(ana.balance)

    println(ana.bonificaiton())

    if(ana.password(123)){
        println("Deu bom")
    }
}
