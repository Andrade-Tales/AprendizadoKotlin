package com.app.aprendizadokotlin.colecoesarrayslistas.teste.lists

import java.io.File.separator

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    )

    // Agrupando os quatro livros em uma lista (Uma lista mutável de)
    // Listas trabalham com objetos
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    // Método Add, adiciona um novo elemento na lista
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()
    
    // Método Remove, remove um elemento da lista
    livros.remove(livro1)
    livros.imprimeComMarcadores()

}

// Criando uma extension function da lista de livros para leitura no console
fun MutableList<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de livros #### \n$textoFormatado")
}