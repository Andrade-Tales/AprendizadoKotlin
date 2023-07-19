package com.app.aprendizadokotlin.colecoesarrayslistas.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaFuncaoComSomatoria() {
    // Criando Array de BigDecimal
    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")

    // convertendo uma String para um BigDecimal (toBigDeciamal)
    println("Salários: " + salarios.contentToString())

    // Aumento de 10% nos salários
    val aumento = "1.0".toBigDecimal()

    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println("Gasto dos salários com aumento de 500R$: " + salariosComAumento.contentToString())

    // Função sum calcula a somatória
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial da empresa:  $gastoInicial")

    // Função fold com valor inicial
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Valor da somatoria de todos os salários: $gastoTotal")

    // Função média dos três maiores salários (Função sorted) retorna uma lista com todos os valores
    // bigDecimal do menor para o maior
    val mediaMaioresSalarios = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("A média dos três maiores salários é: $mediaMaioresSalarios")

    // Função média dos três menores salários
    val mediaMenoresSalarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println("A média dos três menores salários é: $mediaMenoresSalarios")



}


