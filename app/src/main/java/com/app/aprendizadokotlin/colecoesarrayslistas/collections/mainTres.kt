package com.app.aprendizadokotlin.colecoesarrayslistas.collections

fun main() {
    // Simulção de banco de dados
    val banco = BancoDeNomes()

    // Salvando um nome no banco
    banco.salva("Tales")
    println(banco.nomes)

    // Função de cópia de uma variável
    val nomesSalvos: Collection<String> = banco.nomes
    println(BancoDeNomes().nomes)

}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}
