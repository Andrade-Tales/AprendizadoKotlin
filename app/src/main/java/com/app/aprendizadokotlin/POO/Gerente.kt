class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int

) : FuncionarioAdmin(  // Herdando classe Funcionario com seus valores
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    // Função de bonificação
    // Super para reuso de função da classe mãe (Funcionario)
    override val bonificacao: Double
        get() {
            return salario
        }

}