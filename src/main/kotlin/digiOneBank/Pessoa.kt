package digiOneBank

open class Pessoa(
    open val nome: String,
    open val cpf: String
    //Essas propriedades precisam ser "open" para poderem ser sobrescritas.
)