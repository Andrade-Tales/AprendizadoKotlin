import com.app.aprendizadokotlin.POO.Funcionario

abstract class FuncionarioAdmin( // Classe Funcionario ANSTRACT para reutilização de código nas classes filhas
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) { // Classe FuncionarioAdmin herdando de Funcionario para reutilização de código nas classes filhas

    // Função de autenticação
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}