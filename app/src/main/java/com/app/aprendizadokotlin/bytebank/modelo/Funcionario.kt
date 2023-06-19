package com.app.aprendizadokotlin.bytebank.modelo

abstract class Funcionario(  // Assinatura com Abstract para as classes filhas alterarem os valores da bonificação
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    // Função de bonificação transformada em uma PROPERTIE
    // Assinatura com Abstract para as classes filhas alterarem os valores da bonificação
    abstract val bonificacao: Double


}