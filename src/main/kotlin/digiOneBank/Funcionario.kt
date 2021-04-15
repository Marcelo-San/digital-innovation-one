package digiOneBank

// Essa classe herda as propriedades da classe Pessoa.
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
    val cargo: String
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
    // Precisamos sempre dizer o tipo que vai ser retornado.

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: R$ $salario
        Cargo: $cargo
        Auxílio: R$ ${calculoAuxilio()}
    """.trimIndent()
}