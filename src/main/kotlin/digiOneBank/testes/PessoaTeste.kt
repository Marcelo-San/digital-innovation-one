package digiOneBank.testes

import digiOneBank.Pessoa

fun main(){
    val marcelo = Pessoa(nome = "Marcelo Santos TI", cpf = "123.456.789.-11") // Aqui, passamos argumentos nomeados.
    println(marcelo.nome)
    println(marcelo.cpf)
}