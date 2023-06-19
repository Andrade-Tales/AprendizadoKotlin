package com.app.aprendizadokotlin.modelo

interface Autenticavel { // Interfaces não contém construtores

    // Função de autenticação usando propertie
    fun autentica(senha: Int): Boolean
}