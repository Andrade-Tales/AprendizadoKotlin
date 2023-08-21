package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Cliente
import com.app.aprendizadokotlin.bytebank.modelo.ContaPoupanca

fun testaRun() {

    // cálculo da taxa mensal
    val taxaAnual = 0.05
    val taxaMensal: Double = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca =
        ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), numero = 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    // calculo de juros composto
    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("simulação rendimento anual $rendimentoAnual")
}