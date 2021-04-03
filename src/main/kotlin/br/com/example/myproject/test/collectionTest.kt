package br.com.example.myproject.test

fun copyTest() {
    val bank = baseNames()
    val savedNames: MutableCollection<String> = bank.names as MutableCollection<String>
//    savedNames.add("ola")
    bank.saveName("vitor")
    println(bank.names)
}

class baseNames {
    val names: Collection<String>
        get() = Companion._nomes.toList() //devolve uma cópia do bjet, assim nao podendo ser modificado como em savedNames

    fun saveName(name: String) {
        Companion._nomes.add(name)
    }

    companion object {
        private val _nomes = mutableListOf<String>()
    }
}

fun collectionsTest() {
    val nomes: MutableCollection<String> = mutableListOf<String>("vitor", "ana", "maria")

    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    nomes.add("oii")
    nomes.remove("ana")
    println(nomes.contains("ana"))
    println(nomes.size)
}

