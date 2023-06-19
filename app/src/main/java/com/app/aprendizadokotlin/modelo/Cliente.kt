package com.app.aprendizadokotlin.modelo

import com.app.aprendizadokotlin.modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}