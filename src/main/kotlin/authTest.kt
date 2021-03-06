fun authTest() {
    val manager = Manager("Vitor", "666.666.666-66", 1000.00, 123)
    val director = Director("Ana", "777.777.777-77", 1000.00, 444, 200.0)
    val client = Client("Gui", "888.888.888-88", 555)

    val internSystem = InternSystem()

    internSystem.on(manager, 123)
    internSystem.on(director, 444)
    internSystem.on(client, 555)
}