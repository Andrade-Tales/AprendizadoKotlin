package com.app.aprendizadokotlin.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(), // Uso de composição
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean { // Uso de interface
        if (this.senha == senha) {
            return true
        }
        return false
    }
}