package digiOneBank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    cargo: String,
    val senha: String
) : Funcionario(nome, cpf, salario, cargo), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4 /*{
        TODO("Not yet implemented")
    }*/

    override fun login(): Boolean = "123" == senha
}