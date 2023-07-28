package com.app.aprendizadokotlin.colecoesarrayslistas.lists

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

    // Função Add, adiciona um novo elemento na lista
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    // Função Remove, remove um elemento da lista
    livros.remove(livro1)

    livros.imprimeComMarcadores()

    // Função Sorted, ordena a lista (Por ano de publicação)
    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    // Função sortedBy, escolhe o critério de ordenação (seja por título, autor etc...)
    val ordenaPorTitulo = livros.sortedBy { it.titulo }
    ordenaPorTitulo.imprimeComMarcadores()

    // Função sortedBy, escolhe o critério de ordenação (seja por título, autor etc...)
    val ordenaPorAutor = livros.sortedBy { it.autor }
    ordenaPorAutor.imprimeComMarcadores()

    // Função filter, filtra a lista por algum critério
    // Função startsWith, recebe uma String como parâmetro e define o critério de busca por Strings iguais
    // Função map, pega apenas o um elemento da lista ignorando ela inteira
    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("João") } // Filtrando pelo nome do autor
        .sortedBy { it.anoPublicacao } // Ordenando por ano de publicação
        .map { it.titulo } // Pegando apenas o título dos livros

    println(titulos)
}

