package digiOneBank.testes

import digiOneBank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria Luiza", cpf = "222.111.111-22", salario = 5000.0, cargo = "Gerente")
    ImprimeRelatorioFuncionario.imprime(maria)
}