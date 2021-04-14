package digiOneBank

import java.math.BigDecimal

// Essa classe herda as propriedades da classe Pessoa.
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio():
}