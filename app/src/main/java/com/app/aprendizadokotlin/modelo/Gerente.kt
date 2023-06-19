package com.app.aprendizadokotlin.modelo

import com.app.aprendizadokotlin.modelo.FuncionarioAdmin

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
    override val bonificacao: Double
        get() {
            return salario
        }

}