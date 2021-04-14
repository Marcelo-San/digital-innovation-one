package digiOneBank

// Essa classe herda as propriedades da classe Pessoa.
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
    // Precisamos sempre dizer o tipo que vai ser retornado.

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}