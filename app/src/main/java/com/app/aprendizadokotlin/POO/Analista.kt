import com.app.aprendizadokotlin.POO.Funcionario

open class Analista( // Classe Analista OPEN para reutilização de código da classe mãe (Funcionario)
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario( // Herdando classe Funcionario com seus valores
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            println("bonificação do analista")
            return  salario * 0.1
        }
}