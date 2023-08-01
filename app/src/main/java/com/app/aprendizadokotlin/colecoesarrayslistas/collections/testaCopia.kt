package com.app.aprendizadokotlin.colecoesarrayslistas.collections

fun testaCopia() {
    // Simulção de banco de dados
    val banco = BancoDeNomes()

    // Salvando um nome no banco
    banco.salva("Tales")
    println(banco.nomes)

    // Função de cópia de uma variável
    val nomesSalvos: Collection<String> = banco.nomes
    println(BancoDeNomes().nomes)
}