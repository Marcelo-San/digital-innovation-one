class Pessoa {
    var nome:String = "Marcelo"
    var cpf:String = "123.456.789-10"
    private set

    constructor() // Construtor secundário ou primário.

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val marcelo = Pessoa()

    println(marcelo.pessoaInfo())
}