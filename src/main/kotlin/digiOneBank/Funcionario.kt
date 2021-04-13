package digiOneBank

import java.math.BigDecimal

// Essa classe herda as propriedades da classe Pessoa.
class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {}