package com.app.aprendizadokotlin.colecoesarrayslistas.teste

 fun testaMaiorIdade() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val mediaIdade = idades.average()
    println("Média idade: $mediaIdade")

    val todosMaioresDeIdade = idades.all { it >= 18 }
    println("Todos são maiores de idade? $todosMaioresDeIdade")

    val existeMaiorDeIdade = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaiorDeIdade")

    val maioresDeIdade = idades.filter { it >= 18 }
    println("Maiores de idade: $maioresDeIdade")

    val mediaDeIdade: Double = idades.average()
    println("A média de idade é: $mediaDeIdade")

    val buscaIdade = idades.find { it >= 18 }
    println("Busca idade maior ou igual a 18: $buscaIdade")
}
