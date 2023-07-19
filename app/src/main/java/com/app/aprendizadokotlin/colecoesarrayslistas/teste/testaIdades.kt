package com.app.aprendizadokotlin.colecoesarrayslistas.teste

fun testaIdades() {

    // Array de idades
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    // Condição para saber qual é a maior idade
    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: $maiorIdade")

    // Condição para saber qual é a menor idade
    var menorIdade = Int.MAX_VALUE

    // forEach (para cada idade)
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade: $menorIdade")
}