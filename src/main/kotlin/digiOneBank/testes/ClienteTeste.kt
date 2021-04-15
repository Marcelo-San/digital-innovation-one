package digiOneBank.testes

import digiOneBank.Cliente
import digiOneBank.ClienteTipo

fun main(){
    val marcelo = Cliente(
        nome = "Marcelo Santos",
        cpf = "999.999.888-22",
        clienteTipo = ClienteTipo.PF,
        senha = "1235" // Para testar, passamos a senha aqui. Se na saída aparecer "false", a senha está incorreta.
    )

    println(marcelo)

    AutenticacaoTeste().autentica(marcelo)
}