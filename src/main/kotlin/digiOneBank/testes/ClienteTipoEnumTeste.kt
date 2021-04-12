package digiOneBank.testes

import digiOneBank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}") // A própria IDE coloca as chaves para nós.
    }

    // Ou poderia usar um nome de nossa preferência, por exemplo, como abaixo:

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}") // A própria IDE coloca as chaves para nós.
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}