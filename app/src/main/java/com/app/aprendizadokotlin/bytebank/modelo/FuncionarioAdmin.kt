package com.app.aprendizadokotlin.bytebank.modelo

abstract class FuncionarioAdmin( // Classe Funcionario ANSTRACT para reutilização de código nas classes filhas
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
),
    Autenticavel { // Classe com.app.aprendizadokotlin.modelo.FuncionarioAdmin herdando de Funcionario para reutilização de código nas classes filhas

    // Função de autenticação
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}