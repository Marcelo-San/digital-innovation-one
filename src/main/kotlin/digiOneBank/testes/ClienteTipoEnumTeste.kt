package digiOneBank.testes

import digiOneBank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }

    // Ou poderia ser assim, como abaixo:

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }
}