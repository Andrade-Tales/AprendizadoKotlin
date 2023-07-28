package com.app.aprendizadokotlin.colecoesarrayslistas.lists

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {

    // Método CompareTo, responsável por ordenar a lista
    override fun compareTo(other: Livro): Int {
        // Critério: ordenar o livro das lista por ano de publicação
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}


