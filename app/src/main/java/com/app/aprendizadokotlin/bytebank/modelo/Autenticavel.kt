package com.app.aprendizadokotlin.bytebank.modelo

interface Autenticavel { // Interfaces não contém construtores

    // Função de autenticação usando propertie
    fun autentica(senha: Int): Boolean
}