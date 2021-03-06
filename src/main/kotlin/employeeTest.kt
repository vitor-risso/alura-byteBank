fun employeeTest() {
    val vitor = Analist(
        "Vitor",
        "111.111.111-11",
        1000.00,
    )

    println(vitor.name)
    println(vitor.cpf)
    println(vitor.balance)

    println(vitor.bonus)


    val ana = Manager(
        "Ana",
        "222.222.222-22",
        2000.00, 123
    )

    println()
    println(ana.name)
    println(ana.cpf)
    println(ana.balance)

    println(ana.bonus)

    if (ana.auth(123)) {
        println("Deu bom")
    }

    val gui = Director(
        "Guilherme",
        "333.333.33-33",
        4000.00,
        555,
        200.00
    )

    println()
    println(gui.name)
    println(gui.cpf)
    println(gui.balance)
    println(gui.plr)

    println(gui.bonus)

    if (gui.auth(555)) {
        println("Deu bom")
    }
    val marie = Analist("Maria", "444.444.444-44", 3500.00)

    val bonusCalculator = BonusCalculator()

    bonusCalculator.register(vitor)
    bonusCalculator.register(ana)
    bonusCalculator.register(gui)
    bonusCalculator.register(marie)

    println(bonusCalculator.total)



    println()
    println(marie.name)
    println(marie.cpf)
    println(marie.balance)

    println(marie.bonus)
}
