package com.app.aprendizadokotlin.bytebank.teste

import java.lang.NumberFormatException

private fun testaExpressao() {
    fun testaExpressao() {
        val entrada: String = "1.0"

        val valorRecebido: Double? = try {
            entrada.toDouble()
        } catch (e: NumberFormatException) {
            println("Problema na conversão")
            e.printStackTrace()
            null
        }

        val valorComTaxa: Double? = if (valorRecebido != null) {
            valorRecebido + 1.0
        } else {
            null
        }
        if (valorComTaxa != null) {
            println("Valor recebido: $valorComTaxa")
        } else {
            println("valor inválido")
        }

    }
}