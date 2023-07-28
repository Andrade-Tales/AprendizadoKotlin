package com.app.aprendizadokotlin.colecoesarrayslistas.lists

data class Prateleira(
    val genero: String,
    val livros: List<Livro> // Lista imutável
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}