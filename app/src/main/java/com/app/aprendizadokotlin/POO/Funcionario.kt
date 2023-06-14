package com.app.aprendizadokotlin.POO

abstract class Funcionario( // Classe Funcionario OPEN para reutilização de código nas classes filhas
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    // Função de bonificação transformada em uma PROPERTIE
    // Assinatura com Abstract para as classes filhas alterarem os valores da bonificação
   abstract val bonificacao: Double



}