package digiOneBank

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    cargo: String
) : Funcionario(nome, cpf, salario, cargo) {
    override fun calculoAuxilio(): Double = salario * 0.1 /*{
        TODO("Not yet implemented")
    }*/
}