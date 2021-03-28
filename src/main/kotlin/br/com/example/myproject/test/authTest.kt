import br.com.example.myproject.model.Client
import br.com.example.myproject.model.Director
import br.com.example.myproject.model.InternSystem
import br.com.example.myproject.model.Manager

fun authTest() {
    val manager = Manager("Vitor", "666.666.666-66", 1000.00, 123)
    val director = Director("Ana", "777.777.777-77", 1000.00, 444, 200.0)
    val client = Client("Gui", "888.888.888-88", pwd=555)

    val internSystem = InternSystem()

    internSystem.on(manager, 123){
        print("realizadno Pagamento")
    }
    internSystem.on(director, 444){
        print("realizadno Pagamento")
    }
    internSystem.on(client, 555){
        print("realizadno Pagamento")
    }
}