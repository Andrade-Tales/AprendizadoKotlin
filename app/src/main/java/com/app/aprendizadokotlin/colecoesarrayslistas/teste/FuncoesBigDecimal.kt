package com.app.aprendizadokotlin.colecoesarrayslistas.teste

import java.math.BigDecimal

// Função BigDecimal (Array de BigDecimal) com dois parâmetros (valor e Array(BigDecimal))
// Varargs permitem que os usuários passem uma lista de argumentos separados por vírgulas, que o
// compilador irá agrupar automaticamente em uma matriz.
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }

}

// Função somatória
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

// Função calcula média de salários
fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
