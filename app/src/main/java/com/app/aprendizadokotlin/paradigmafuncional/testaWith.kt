package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        enderecoCompleto()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}