package com.app.aprendizadokotlin.colecoesarrayslistas.lists

fun main() {
    listaDeLivros
        .groupBy {
            it.editora
                ?: "Editora desconhecida" // ?: Elvis operator, quando a editora for nula, retorna
            // "Editora desconhecida"
        } // Função groupBy, ele espera um elemento para agrupar (editora, autor, titulo, etc)
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}