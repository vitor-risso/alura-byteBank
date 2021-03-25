package br.com.example.myproject.model

class Address(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String? = ""
) {
    override fun toString(): String {
        return """Address(logradouro='$logradouro', 
            |numero=$numero, 
            |bairro='$bairro', 
            |cidade='$cidade', 
            |estado='$estado', 
            |cep='$cep', 
            |complemento=$complemento)""".trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (logradouro != other.logradouro) return true
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return true
        if (complemento != other.complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + (complemento?.hashCode() ?: 0)
        return result
    }


}
