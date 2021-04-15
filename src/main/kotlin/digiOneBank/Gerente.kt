package digiOneBank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    cargo: String
) : Funcionario(nome, cpf, salario, cargo) {
    override fun calculoAuxilio(): Double = salario * 0.4 /*{
        TODO("Not yet implemented")
    }*/
}