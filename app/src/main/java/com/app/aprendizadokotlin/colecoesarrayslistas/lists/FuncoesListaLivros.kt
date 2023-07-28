package com.app.aprendizadokotlin.colecoesarrayslistas.lists

// Criando uma extension function da lista de livros para leitura no console
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull() // Filtra os livros que são diferentes de nulo
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de livros #### \n$textoFormatado")
}
