package com.app.aprendizadokotlin.colecoesarrayslistas.lists

val listaDeLivros = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mémorias póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ),
    Livro(
        titulo = "Iracema",
        autor = "José Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora C"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora A"
    ),
    Livro(
        titulo = "O Cortício",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    ),
)

// Lista de livros que recebem valores nulos
val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Mémorias póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ),
    Livro(
        titulo = "Iracema",
        autor = "José Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora C"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora A"
    ),
    Livro(
        titulo = "O Cortício",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    ),
)