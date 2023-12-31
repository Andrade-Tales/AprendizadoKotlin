package com.app.aprendizadokotlin.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double

    ) : Funcionario( // Herdando classe Funcionario com seus valores
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.05
}