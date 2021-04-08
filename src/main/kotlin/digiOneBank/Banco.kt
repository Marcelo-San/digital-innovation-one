package digiOneBank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun bancoInfo() = "Banco: $nome - Agência: $numero"
}
