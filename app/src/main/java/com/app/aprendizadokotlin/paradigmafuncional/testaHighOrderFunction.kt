package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Autenticavel
import com.app.aprendizadokotlin.bytebank.modelo.Endereco
import com.app.aprendizadokotlin.bytebank.modelo.SistemaInterno

// funções de alta ordem ( função recebendo outra função como argumento)
fun testaHighOrderFunction() {

    val testaFuncao: () -> Unit
    Endereco().let {
        it
    } // highOrderFunction
    "".let(::testaRecebeString)
    1.let {
        it
    }
    teste(1, {})

    soma(1, 5, resultado = { valor ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })

}

fun testaRecebeString(valor: String) {

}

fun teste(teste: Int, bloco: () -> Unit) {

}

// soma com high order function
fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")

}

// assinatura com receiver
fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    // imprimindo como membro do INT
    val total = a + b
    total.resultado()
    println("depois da soma")
}






