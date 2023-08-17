package com.app.aprendizadokotlin.paradigmafuncional

fun testaTipoFuncaoAnonima() {

    // função anônima
//    val testaTipoFuncaoAnonima: () -> Unit = fun() {
//        println("Executa como anonima")
//    }
//    println(testaTipoFuncaoAnonima)

    // função anônima com inferência de tipo
    val testaTipoFuncaoAnonima: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        println("Executa como anônima")
        return a + b
    }
    println(testaTipoFuncaoAnonima(20, 10))
}
