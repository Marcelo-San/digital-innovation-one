package digiOneBank.testes

import digiOneBank.Funcionario
import java.math.BigDecimal

fun main(){
    val luciani = Funcionario(nome = "Luciani Magna", cpf = "111.111.111.-22", salario = BigDecimal.valueOf(2000.59)) // Aqui, passamos argumentos nomeados.
    println(luciani.nome)
    println(luciani.cpf)
    println("R$ ${luciani.salario}")
}