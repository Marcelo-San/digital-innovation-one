package digiOneBank.testes

import digiOneBank.Analista

fun main(){
    val luciani = Analista(nome = "Luciani Magna", cpf = "111.111.111-22", salario = 2000.0, cargo = "Analista")
    ImprimeRelatorioFuncionario.imprime(luciani)
}