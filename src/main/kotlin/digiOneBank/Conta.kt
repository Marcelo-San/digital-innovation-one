package digiOneBank

import java.math.BigDecimal

// Classe conta já criada como construtor primário.
class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}