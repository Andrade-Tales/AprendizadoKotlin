package com.app.aprendizadokotlin.colecoesarrayslistas.teste

 fun testaAumento() {
    // Array de salários de funcionários
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    // Variável aumento de salário para 10%
    val aumento = 1.1

    // Condição para aumento de 10% do salário
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    // Outra maneira de fazer a condição de aumento para 10%
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}