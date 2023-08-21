package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Endereco

fun testaImplementacaoComLet() {

    // sintaxe sem o let (chamadas encadeadas)
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    // sintaxe com o let e high order function
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    // lista de endereços (usando filter) filtrando por endereços que tem complemento
    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}