package com.app.aprendizadokotlin.paradigmafuncional

import com.app.aprendizadokotlin.bytebank.modelo.Endereco

// funções de alta ordem ( função recebendo outra função como argumento)
fun testaHighOrderFunction() {

    val testaFuncao: () -> Unit
    Endereco().let({
        it
    }) // highOrderFunction
    "".let(::testaRecebeString)
    1.let {
        it
    }
    teste(1, {})
}

fun testaRecebeString(valor: String) {

}

fun teste(teste: Int, bloco: () -> Unit) : () -> Unit {

}



