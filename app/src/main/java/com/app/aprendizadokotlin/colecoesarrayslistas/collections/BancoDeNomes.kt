package com.app.aprendizadokotlin.colecoesarrayslistas.collections

class BancoDeNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}
