package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Endereco


/*
São funções da biblioteca padrão do Kotlin cujo o objetivo é executar um bloco de código dentro de
 um escopo/contexto de um objeto que podem ou não ter um valor de retorno. São cinco funções: let,
 run , with , apply e also .
 */
fun testaScopeFunction() {

    run {
        println("execução do run sem extensão")
    }

    val endereco: Endereco = Endereco()
        // .also { println("criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )

        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    soma(1, 5, resultado = (::println))

}