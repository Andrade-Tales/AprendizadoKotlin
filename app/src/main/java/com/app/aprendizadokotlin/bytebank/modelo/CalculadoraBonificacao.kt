package com.app.aprendizadokotlin.bytebank.modelo

// Classe para soma de toda a bonificação de todos os funcionários
class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun resgistra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

//    fun resgistra(gerente: com.app.aprendizadokotlin.modelo.Gerente) {
//        this.total += gerente.bonificacao
//    }

//    fun resgistra(diretor: com.app.aprendizadokotlin.modelo.Diretor) {
//        this.total += diretor.bonificacao
//    }
}