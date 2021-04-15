package digiOneBank.testes

import digiOneBank.Funcionario

class ImprimeRelatorioFuncionario {
    //Método estático para ser invocado via classe, não via instância.
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}