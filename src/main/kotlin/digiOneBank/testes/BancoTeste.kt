package digiOneBank.testes

import digiOneBank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero =  12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //Não faz sentido no mundo real, mas só para mostrar como alterar uma informação, criando uma cópia do Data Class.
    val bancoDigi = digiOneBank.copy(nome = "BancoDigi")

    println(bancoDigi.bancoInfo())
}