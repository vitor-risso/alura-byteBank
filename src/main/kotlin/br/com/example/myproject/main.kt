package br.com.example.myproject

fun main() {
    println("STARTING... \n")

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        2 to 34.0,
    )

//    val velorPedido = pedidos.getValue(5)

    pedidos.getOrElse(9, {
        "Pedido não cadastrado"
    })
    pedidos.getOrDefault(0, -1.0) // devolve vaor default
    pedidos.keys // devolve as chaves
    pedidos.values // devolve os valores
    pedidos.filter { (number, value) ->
        number % 2 == 0
    } // devolve um novo array
    pedidos.filterKeys { key ->
        key % 2 ==0
    }
    pedidos.filterValues { value ->
        value > 50.0
    }
}

private fun mapTest(pedidos: MutableMap<Int, Double>) {
    val pedido = pedidos[1] // precisa colocar a chave nao a posicao do item
    pedido?.let {
        println(pedido)
    }

    for (entry in pedidos) {
        println(entry.key)
        println(entry.value)
    }

    pedidos[3] = 90.0
    pedidos.put(4, 902.0)
    println(pedidos)
    pedidos.put(4, 100.0)
    println(pedidos) // so add se n tiver valor na chave ainda
    pedidos.putIfAbsent(5, 32.32)
    pedidos.remove(4, 100.0)// so vai remover o 4 se o valor dele for 100, o segundo parametro é opcional
}
