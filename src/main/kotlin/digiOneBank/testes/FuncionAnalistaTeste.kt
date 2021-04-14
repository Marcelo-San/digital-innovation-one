package digiOneBank.testes

import digiOneBank.Analista
import digiOneBank.Funcionario

fun main(){
    val luciani = Analista(nome = "Luciani Magna", cpf = "111.111.111-22", salario = 2000.0)
    imprimeRelatorio(luciani)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())