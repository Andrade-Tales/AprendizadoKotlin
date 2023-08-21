package com.app.aprendizadokotlin.paradigmafuncional

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

 //retorno sendo um inteiro
fun soma(a: Int, b: Int): Int {
    return a + b
}