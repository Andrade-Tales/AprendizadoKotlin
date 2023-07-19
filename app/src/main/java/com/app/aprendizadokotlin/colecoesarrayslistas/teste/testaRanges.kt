package com.app.aprendizadokotlin.colecoesarrayslistas.teste

fun testaRanges() {
    // Range (série ou sequência)
    val serie: IntRange = 1.rangeTo(10) // Range de 1 .. 10
    for (s in serie) {
        print("$s ")
    }
    println()

    // Range de números pares
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    // Range de números pares de forma decrescente
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    println()

    // Range condicional de salários em intervalos
    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if (salario in intervalo) {
        println("Está no intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    println()

    // Range condicional por letra do alfabeto
    val alfabeto = 'a'..'z'
    val letra = 's'
    println(letra in alfabeto)
}
