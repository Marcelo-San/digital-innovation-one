package digiOneBank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "1234" == senha /*{
        TODO("Not yet implemented")
    }*/

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()

}